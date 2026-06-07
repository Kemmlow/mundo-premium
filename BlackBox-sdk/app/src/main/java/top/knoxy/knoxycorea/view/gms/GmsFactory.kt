package dev.knoxy.corea.view.gms

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.knoxy.corea.data.GmsRepository

/**
 *
 * @Description:
 * @Author: KnoxyCore
 * @CreateDate: 2022/3/2 21:15
 */
class GmsFactory(private val repo:GmsRepository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GmsViewModel(repo) as T
    }
}