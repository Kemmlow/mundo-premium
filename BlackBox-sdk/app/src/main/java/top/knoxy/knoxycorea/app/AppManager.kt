package dev.knoxy.corea.app

import android.content.Context
import android.content.SharedPreferences
import dev.knoxy.corea.view.main.KnoxyCoreLoader

object AppManager {
    @JvmStatic
    val mKnoxyCoreLoader by lazy {
        KnoxyCoreLoader()
    }

    @JvmStatic
    val mKnoxyCoreCore by lazy {
        mKnoxyCoreLoader.getKnoxyCoreCore()
    }

    @JvmStatic
    val mRemarkSharedPreferences: SharedPreferences by lazy {
        App.getContext().getSharedPreferences("UserRemark",Context.MODE_PRIVATE)
    }

    fun doAttachBaseContext(context: Context) {
        try {
            mKnoxyCoreLoader.attachBaseContext(context)
            mKnoxyCoreLoader.addLifecycleCallback()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun doOnCreate(context: Context) {
        mKnoxyCoreLoader.doOnCreate(context)
        initThirdService(context)
    }

    private fun initThirdService(context: Context) {}
}
