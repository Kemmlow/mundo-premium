package dev.knoxy.corea.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import dev.knoxy.core.KnoxyCoreCore

/**
 *
 * @Description: 快捷方式跳转activity
 * @Author: wukaicheng
 * @CreateDate: 2022/2/11 23:13
 */
class ShortcutActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pkg = intent.getStringExtra("pkg")
        val userID = intent.getIntExtra("userId",0)

        lifecycleScope.launch {
            KnoxyCoreCore.get().launchApk(pkg,userID)
            finish()
        }
    }
}