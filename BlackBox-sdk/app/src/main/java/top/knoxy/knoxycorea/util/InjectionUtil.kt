package dev.knoxy.corea.util

import dev.knoxy.corea.data.AppsRepository
import dev.knoxy.corea.data.FakeLocationRepository
import dev.knoxy.corea.data.GmsRepository
import dev.knoxy.corea.data.XpRepository
import dev.knoxy.corea.view.apps.AppsFactory
import dev.knoxy.corea.view.fake.FakeLocationFactory
import dev.knoxy.corea.view.gms.GmsFactory
import dev.knoxy.corea.view.list.ListFactory
import dev.knoxy.corea.view.xp.XpFactory

/**
 *
 * @Description:
 * @Author: wukaicheng
 * @CreateDate: 2021/4/29 22:38
 */
object InjectionUtil {

    private val appsRepository = AppsRepository()

    private val xpRepository = XpRepository()

    private val gmsRepository = GmsRepository()

    private val fakeLocationRepository = FakeLocationRepository()

    fun getAppsFactory() : AppsFactory {
        return AppsFactory(appsRepository)
    }

    fun getListFactory(): ListFactory {
        return ListFactory(appsRepository)
    }

    fun getXpFactory():XpFactory{
        return XpFactory(xpRepository)
    }

    fun getGmsFactory():GmsFactory{
        return GmsFactory(gmsRepository)
    }

    fun getFakeLocationFactory():FakeLocationFactory{
        return FakeLocationFactory(fakeLocationRepository)
    }
}