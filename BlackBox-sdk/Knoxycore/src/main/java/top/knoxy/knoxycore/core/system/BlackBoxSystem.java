package dev.knoxy.core.core.system;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import dev.knoxy.core.KnoxyCoreCore;
import dev.knoxy.core.core.env.AppSystemEnv;
import dev.knoxy.core.core.env.BEnvironment;
import dev.knoxy.core.core.system.accounts.BAccountManagerService;
import dev.knoxy.core.core.system.am.BActivityManagerService;
import dev.knoxy.core.core.system.am.BJobManagerService;
import dev.knoxy.core.core.system.location.BLocationManagerService;
import dev.knoxy.core.core.system.notification.BNotificationManagerService;
import dev.knoxy.core.core.system.os.BStorageManagerService;
import dev.knoxy.core.core.system.pm.BPackageInstallerService;
import dev.knoxy.core.core.system.pm.BPackageManagerService;
import dev.knoxy.core.core.system.pm.BXposedManagerService;
import dev.knoxy.core.core.system.user.BUserHandle;
import dev.knoxy.core.core.system.user.BUserManagerService;
import dev.knoxy.core.entity.pm.InstallOption;
import dev.knoxy.core.utils.FileUtils;

import static dev.knoxy.core.core.env.BEnvironment.EMPTY_JAR;
import static dev.knoxy.core.core.env.BEnvironment.JUNIT_JAR;

/**
 * Created by Milk on 4/22/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class KnoxyCoreSystem {
    private static KnoxyCoreSystem sKnoxyCoreSystem;
    private final List<ISystemService> mServices = new ArrayList<>();
    private final static AtomicBoolean isStartup = new AtomicBoolean(false);

    public static KnoxyCoreSystem getSystem() {
        if (sKnoxyCoreSystem == null) {
            synchronized (KnoxyCoreSystem.class) {
                if (sKnoxyCoreSystem == null) {
                    sKnoxyCoreSystem = new KnoxyCoreSystem();
                }
            }
        }
        return sKnoxyCoreSystem;
    }

    public void startup() {
        if (isStartup.getAndSet(true))
            return;
        BEnvironment.load();

        mServices.add(BPackageManagerService.get());
        mServices.add(BUserManagerService.get());
        mServices.add(BActivityManagerService.get());
        mServices.add(BJobManagerService.get());
        mServices.add(BStorageManagerService.get());
        mServices.add(BPackageInstallerService.get());
        mServices.add(BXposedManagerService.get());
        mServices.add(BProcessManagerService.get());
        mServices.add(BAccountManagerService.get());
        mServices.add(BLocationManagerService.get());
        mServices.add(BNotificationManagerService.get());

        for (ISystemService service : mServices) {
            service.systemReady();
        }

        List<String> preInstallPackages = AppSystemEnv.getPreInstallPackages();
        for (String preInstallPackage : preInstallPackages) {
            try {
                if (!BPackageManagerService.get().isInstalled(preInstallPackage, BUserHandle.USER_ALL)) {
                    PackageInfo packageInfo = KnoxyCoreCore.getPackageManager().getPackageInfo(preInstallPackage, 0);
                    BPackageManagerService.get().installPackageAsUser(packageInfo.applicationInfo.sourceDir, InstallOption.installBySystem(), BUserHandle.USER_ALL);
                }
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        initJarEnv();
    }

    private void initJarEnv() {
        try {
            InputStream junit = KnoxyCoreCore.getContext().getAssets().open("junit.jar");
            FileUtils.copyFile(junit, JUNIT_JAR);

            InputStream empty = KnoxyCoreCore.getContext().getAssets().open("empty.jar");
            FileUtils.copyFile(empty, EMPTY_JAR);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
