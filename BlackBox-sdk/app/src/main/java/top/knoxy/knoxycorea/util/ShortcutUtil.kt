package dev.knoxy.corea.util

import android.content.Context
import android.content.Intent
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import androidx.core.graphics.drawable.toBitmap
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import dev.knoxy.corea.R
import dev.knoxy.corea.app.App
import dev.knoxy.corea.app.AppManager
import dev.knoxy.corea.bean.AppInfo
import dev.knoxy.corea.util.ContextUtil.openAppSystemSettings
import dev.knoxy.corea.view.main.ShortcutActivity

/**
 *
 * @Description: 桌面快捷方式 工具类
 * @Author: KnoxyCore
 * @CreateDate: 2022/2/27 22:56
 */
object ShortcutUtil {


    /**
     * 创建桌面快捷方式
     * @param userID Int userID
     * @param info AppInfo
     */
    fun createShortcut(context: Context,userID: Int, info: AppInfo) {

        if (ShortcutManagerCompat.isRequestPinShortcutSupported(context)) {
            val labelName = info.name + userID
            val intent = Intent(context, ShortcutActivity::class.java)
                .setAction(Intent.ACTION_MAIN)
                .putExtra("pkg", info.packageName)
                .putExtra("userId", userID)
            MaterialDialog(context).show {
                title(res = R.string.app_shortcut)
                input(
                    hintRes = R.string.shortcut_name,
                    prefill = labelName
                ) { _, input ->

                    val shortcutInfo: ShortcutInfoCompat =
                        ShortcutInfoCompat.Builder(context, info.packageName + userID)
                            .setIntent(intent)
                            .setShortLabel(input)
                            .setLongLabel(input)
                            .setIcon(IconCompat.createWithBitmap(info.icon.toBitmap()))
                            .build()

                    ShortcutManagerCompat.requestPinShortcut(context, shortcutInfo, null)
                    showAllowPermissionDialog(context)
                }
                positiveButton(R.string.done)
                negativeButton(R.string.cancel)
            }

        } else {
            toast(R.string.cannot_create_shortcut)
        }
    }

    private fun showAllowPermissionDialog(context: Context){
        if (!AppManager.mKnoxyCoreLoader.showShortcutPermissionDialog()){
            return
        }

        MaterialDialog(context).show {
            title(R.string.try_add_shortcut)
            message(R.string.add_shortcut_fail_msg)
            positiveButton(R.string.done)
            negativeButton(R.string.permission_setting){
                App.getContext().openAppSystemSettings()
            }

            neutralButton(R.string.no_reminders){
                AppManager.mKnoxyCoreLoader.invalidShortcutPermissionDialog(false)
            }
        }

    }
}