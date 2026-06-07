package dev.knoxy.corea.data

import androidx.lifecycle.MutableLiveData
import dev.knoxy.core.KnoxyCoreCore
import dev.knoxy.corea.R
import dev.knoxy.corea.app.AppManager
import dev.knoxy.corea.bean.GmsBean
import dev.knoxy.corea.bean.GmsInstallBean
import dev.knoxy.corea.util.getString

/**
 *
 * @Description:
 * @Author: KnoxyCore
 * @CreateDate: 2022/3/2 21:14
 */
class GmsRepository {


    fun getGmsInstalledList(mInstalledLiveData: MutableLiveData<List<GmsBean>>) {
        val userList = arrayListOf<GmsBean>()

        KnoxyCoreCore.get().users.forEach {
            val userId = it.id
            val userName =
                AppManager.mRemarkSharedPreferences.getString("Remark$userId", "User $userId") ?: ""
            val isInstalled = KnoxyCoreCore.get().isInstallGms(userId)
            val bean = GmsBean(userId, userName, isInstalled)
            userList.add(bean)
        }

        mInstalledLiveData.postValue(userList)
    }

    fun installGms(
        userID: Int,
        mUpdateInstalledLiveData: MutableLiveData<GmsInstallBean>
    ) {
        val installResult = KnoxyCoreCore.get().installGms(userID)

        val result = if (installResult.success) {
            getString(R.string.install_success)
        } else {
            getString(R.string.install_fail, installResult.msg)
        }

        val bean = GmsInstallBean(userID,installResult.success,result)
        mUpdateInstalledLiveData.postValue(bean)
    }

    fun uninstallGms(
        userID: Int,
        mUpdateInstalledLiveData: MutableLiveData<GmsInstallBean>
    ) {
        var isSuccess = false
        if (KnoxyCoreCore.get().isInstallGms(userID)) {
            isSuccess = KnoxyCoreCore.get().uninstallGms(userID)
        }

        val result = if (isSuccess) {
            getString(R.string.uninstall_success)
        } else {
            getString(R.string.uninstall_fail)
        }

        val bean = GmsInstallBean(userID,isSuccess,result)

        mUpdateInstalledLiveData.postValue(bean)
    }
}