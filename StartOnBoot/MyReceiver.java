package com.utilityar.workflow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    private static MyReceiver instance;

    // Triggered when an Intent is catched
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, UnityPlayerActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }

    // static method to create our receiver object, it'll be Unity that will create ou receiver object (singleton)
    public static void createInstance()
    {
        if(instance ==  null)
        {
            instance = new MyReceiver();
        }

    }
}
