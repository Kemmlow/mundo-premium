package dev.knoxy.corea.view.fake

import androidx.lifecycle.MutableLiveData
import dev.knoxy.core.entity.location.BLocation
import dev.knoxy.corea.bean.FakeLocationBean
import dev.knoxy.corea.data.FakeLocationRepository
import dev.knoxy.corea.view.base.BaseViewModel

/**
 *
 * @Author: KnoxyCoreing
 * @CreateDate: 2022/3/14
 */
class FakeLocationViewModel(private val mRepo: FakeLocationRepository) : BaseViewModel() {

    val appsLiveData = MutableLiveData<List<FakeLocationBean>>()


    fun getInstallAppList(userID: Int) {
        launchOnUI {
            mRepo.getInstalledAppList(userID, appsLiveData)
        }
    }

    fun setPattern(userId: Int, pkg: String, pattern: Int) {
        launchOnUI {
            mRepo.setPattern(userId, pkg, pattern)
        }
    }

    fun setLocation(userId: Int, pkg: String, location: BLocation) {
        launchOnUI {
            mRepo.setLocation(userId, pkg, location)
        }
    }

}