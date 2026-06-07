package dev.knoxy.corea.view.fake

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.knoxy.corea.data.FakeLocationRepository

/**
 *
 * @Author: KnoxyCoreing
 * @CreateDate: 2022/3/14
 */
class FakeLocationFactory(private val repo: FakeLocationRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FakeLocationViewModel(repo) as T
    }
}