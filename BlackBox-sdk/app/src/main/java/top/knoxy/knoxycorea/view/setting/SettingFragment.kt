package dev.knoxy.corea.view.setting

import android.content.Intent
import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat
import dev.knoxy.core.KnoxyCoreCore
import dev.knoxy.corea.R
import dev.knoxy.corea.app.AppManager
import dev.knoxy.corea.util.toast
import dev.knoxy.corea.view.gms.GmsManagerActivity
import dev.knoxy.corea.view.xp.XpActivity

/**
 *
 * @Description:
 * @Author: wukaicheng
 * @CreateDate: 2021/5/6 22:13
 */
class SettingFragment : PreferenceFragmentCompat() {

    private lateinit var xpEnable: SwitchPreferenceCompat

    private lateinit var xpModule: Preference

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.setting, rootKey)

        xpEnable = findPreference("xp_enable")!!
        xpEnable.isChecked = KnoxyCoreCore.get().isXPEnable

        xpEnable.setOnPreferenceChangeListener { _, newValue ->
            KnoxyCoreCore.get().isXPEnable = (newValue == true)
            true
        }
        //xp模块跳转
        xpModule = findPreference("xp_module")!!
        xpModule.setOnPreferenceClickListener {
            val intent = Intent(requireActivity(), XpActivity::class.java)
            requireContext().startActivity(intent)
            true
        }
        initGms()

        invalidHideState{
            val xpHidePreference: Preference = (findPreference("xp_hide")!!)
            val hideXposed = AppManager.mKnoxyCoreLoader.hideXposed()
            xpHidePreference.setDefaultValue(hideXposed)
            xpHidePreference
        }

        invalidHideState{
            val rootHidePreference: Preference = (findPreference("root_hide")!!)
            val hideRoot = AppManager.mKnoxyCoreLoader.hideRoot()
            rootHidePreference.setDefaultValue(hideRoot)
            rootHidePreference
        }

        invalidHideState {
            val daemonPreference: Preference = (findPreference("daemon_enable")!!)
            val mDaemonEnable = AppManager.mKnoxyCoreLoader.daemonEnable()
            daemonPreference.setDefaultValue(mDaemonEnable)
            daemonPreference
        }
    }

    private fun initGms() {
        val gmsManagerPreference: Preference = (findPreference("gms_manager")!!)

        if (KnoxyCoreCore.get().isSupportGms) {

            gmsManagerPreference.setOnPreferenceClickListener {
                GmsManagerActivity.start(requireContext())
                true
            }
        } else {
            gmsManagerPreference.summary = getString(R.string.no_gms)
            gmsManagerPreference.isEnabled = false
        }
    }

    private fun invalidHideState(block: () -> Preference) {
        val pref = block()
        pref.setOnPreferenceChangeListener { preference, newValue ->
            val tmpHide = (newValue == true)
            when (preference.key) {
                "xp_hide" -> {
                    AppManager.mKnoxyCoreLoader.invalidHideXposed(tmpHide)
                }

                "root_hide" -> {

                    AppManager.mKnoxyCoreLoader.invalidHideRoot(tmpHide)
                }

                "daemon_enable" -> {
                    AppManager.mKnoxyCoreLoader.invalidDaemonEnable(tmpHide)
                }
            }

            toast(R.string.restart_module)
            return@setOnPreferenceChangeListener true
        }
    }
}