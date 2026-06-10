package black.android.telephony;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.telephony.NeighboringCellInfo")
public interface NeighboringCellInfo {
    @BField
    int mCid();

    @BField
    int mLac();

    @BField
    int mRssi();
}
