package tw.com.flag.ch01_hello;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "pandora_boot";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "RECEIVE: ACTION_BOOT_COMPLETED");
        A.a("BootBroadcastReceiver onReceive xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        Intent startServiceIntent = new Intent(context, SetupPandoraSubService.class);
//        context.startService(startServiceIntent);
    }
}
