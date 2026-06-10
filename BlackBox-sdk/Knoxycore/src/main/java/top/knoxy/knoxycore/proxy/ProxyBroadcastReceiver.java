package dev.knoxy.core.proxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;

import dev.knoxy.core.KnoxyCoreCore;
import dev.knoxy.core.entity.am.PendingResultData;
import dev.knoxy.core.proxy.record.ProxyBroadcastRecord;

/**
 * Created by KnoxyCore on 2022/2/25.
 */
public class ProxyBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "ProxyBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        intent.setExtrasClassLoader(context.getClassLoader());
        ProxyBroadcastRecord record = ProxyBroadcastRecord.create(intent);
        if (record.mIntent == null) {
            return;
        }
        PendingResult pendingResult = goAsync();
        try {
            KnoxyCoreCore.getBActivityManager().scheduleBroadcastReceiver(record.mIntent, new PendingResultData(pendingResult), record.mUserId);
        } catch (RemoteException e) {
            pendingResult.finish();
        }
    }
}