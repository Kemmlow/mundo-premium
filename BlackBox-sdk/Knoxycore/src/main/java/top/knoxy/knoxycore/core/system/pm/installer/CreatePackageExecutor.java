package dev.knoxy.core.core.system.pm.installer;

import dev.knoxy.core.core.env.BEnvironment;
import dev.knoxy.core.core.system.pm.BPackageSettings;
import dev.knoxy.core.entity.pm.InstallOption;
import dev.knoxy.core.utils.FileUtils;

/**
 * Created by Milk on 4/24/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 * 创建包相关的信息
 */
public class CreatePackageExecutor implements Executor {

    @Override
    public int exec(BPackageSettings ps, InstallOption option, int userId) {
        FileUtils.deleteDir(BEnvironment.getAppDir(ps.pkg.packageName));

        // create app dir
        FileUtils.mkdirs(BEnvironment.getAppDir(ps.pkg.packageName));
        FileUtils.mkdirs(BEnvironment.getAppLibDir(ps.pkg.packageName));
        return 0;
    }
}
