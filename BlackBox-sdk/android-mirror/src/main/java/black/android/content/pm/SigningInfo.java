package black.android.content.pm;

import android.content.pm.PackageParser.SigningDetails;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BConstructor;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.content.pm.SigningInfo")
public interface SigningInfo {
    @BConstructor
    android.content.pm.SigningInfo _new(SigningDetails SigningDetails0);

    @BField
    SigningDetails mSigningDetails();
}
