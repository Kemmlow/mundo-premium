package dev.knoxy.corea.view.main

import android.app.Application
import android.content.Context
import android.util.Log
import dev.knoxy.core.KnoxyCoreCore
import dev.knoxy.core.app.BActivityThread
import dev.knoxy.core.app.configuration.AppLifecycleCallback
import dev.knoxy.core.app.configuration.ClientConfiguration
import dev.knoxy.corea.app.App
import dev.knoxy.corea.biz.cache.AppSharedPreferenceDelegate
import java.io.File

/**
 *
 * @Description:
 * @Author: wukaicheng
 * @CreateDate: 2021/5/6 23:38
 */
class KnoxyCoreLoader {


    private var mHideRoot by AppSharedPreferenceDelegate(App.getContext(), false)
    private var mHideXposed by AppSharedPreferenceDelegate(App.getContext(), false)
    private var mDaemonEnable by AppSharedPreferenceDelegate(App.getContext(), false)
    private var mShowShortcutPermissionDialog by AppSharedPreferenceDelegate(App.getContext(), true)


    fun hideRoot(): Boolean {
        return mHideRoot
    }

    fun invalidHideRoot(hideRoot: Boolean) {
        this.mHideRoot = hideRoot
    }

    fun hideXposed(): Boolean {
        return mHideXposed
    }

    fun invalidHideXposed(hideXposed: Boolean) {
        this.mHideXposed = hideXposed
    }

    fun daemonEnable(): Boolean {
        return mDaemonEnable
    }

    fun invalidDaemonEnable(enable: Boolean) {
        this.mDaemonEnable = enable
    }

    fun showShortcutPermissionDialog(): Boolean {
        return mShowShortcutPermissionDialog
    }

    fun invalidShortcutPermissionDialog(show: Boolean) {
        this.mShowShortcutPermissionDialog = show
    }

    fun getKnoxyCoreCore(): KnoxyCoreCore {
        return KnoxyCoreCore.get()
    }

    fun addLifecycleCallback() {
        KnoxyCoreCore.get().addAppLifecycleCallback(object : AppLifecycleCallback() {
            override fun beforeCreateApplication(
                packageName: String?,
                processName: String?,
                context: Context?,
                userId: Int
            ) {
                Log.d(
                    TAG,
                    "beforeCreateApplication: pkg $packageName, processName $processName,userID:${BActivityThread.getUserId()}"
                )
            }


            override fun beforeApplicationOnCreate(
                packageName: String?,
                processName: String?,
                application: Application?,
                userId: Int
            ) {
                Log.d(TAG, "beforeApplicationOnCreate: pkg $packageName, processName $processName")
            }

            override fun afterApplicationOnCreate(
                packageName: String?,
                processName: String?,
                application: Application?,
                userId: Int
            ) {
                Log.d(TAG, "afterApplicationOnCreate: pkg $packageName, processName $processName")
//                RockerManager.init(application,userId)
            }
        })
    }

    fun attachBaseContext(context: Context) {
        KnoxyCoreCore.get().doAttachBaseContext(context, object : ClientConfiguration() {
            override fun getHostPackageName(): String {
                return context.packageName
            }

            override fun isHideRoot(): Boolean {
                return mHideRoot
            }

            override fun isHideXposed(): Boolean {
                return mHideXposed
            }

            override fun isEnableDaemonService(): Boolean {
                return mDaemonEnable
            }

            override fun requestInstallPackage(file: File?, userId: Int): Boolean {
                val packageInfo =
                    context.packageManager.getPackageArchiveInfo(file!!.absolutePath, 0)
                return false
            }
        })
    }

    fun doOnCreate(context: Context) {
        KnoxyCoreCore.get().doCreate()

    }


    companion object {

        val TAG: String = KnoxyCoreLoader::class.java.simpleName

    }

}