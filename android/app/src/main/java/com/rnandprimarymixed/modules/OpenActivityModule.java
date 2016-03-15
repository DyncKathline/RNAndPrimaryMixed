package com.rnandprimarymixed.modules;

import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.rnandprimarymixed.OpenActivity;

public class OpenActivityModule extends ReactContextBaseJavaModule {

    private static final String MODULE_CLASS = "OpenActivityModule";
    private ReactApplicationContext context;

    public OpenActivityModule(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    @Override
    public String getName() {
        return MODULE_CLASS;
    }

    @ReactMethod
    public void openActivity(){
        Intent intent = new Intent(context, OpenActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
