package dev.knoxy.corea.view.gms

import androidx.lifecycle.MutableLiveData
import dev.knoxy.corea.bean.GmsBean
import dev.knoxy.corea.bean.GmsInstallBean
import dev.knoxy.corea.data.GmsRepository
import dev.knoxy.corea.view.base.BaseViewModel

/**
 *
 * @Description: gms viewModel
 * @Author: KnoxyCore
 * @CreateDate: 2022/3/2 21:11
 */
class GmsViewModel(private val mRepo: GmsRepository) : BaseViewModel() {

    val mInstalledLiveData = MutableLiveData<List<GmsBean>>()

    val mUpdateInstalledLiveData = MutableLiveData<GmsInstallBean>()

    fun getInstalledUser() {
        launchOnUI {
            mRepo.getGmsInstalledList(mInstalledLiveData)
        }
    }

    fun installGms(userID: Int) {
        launchOnUI {
            mRepo.installGms(userID,mUpdateInstalledLiveData)
        }
    }

    fun uninstallGms(userID: Int) {
        launchOnUI {
            mRepo.uninstallGms(userID,mUpdateInstalledLiveData)
        }
    }
}