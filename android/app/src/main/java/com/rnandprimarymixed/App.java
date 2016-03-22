package com.rnandprimarymixed;

import android.app.Application;

import com.facebook.react.ReactInstanceManager;

/**
 * Created by xiongxuesong-pc on 2016/3/22.
 */
public class App extends Application {

    private static App mInstance;
    public ReactInstanceManager mReactInstanceManager;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public App(){
        super();
        mInstance = this;
    }

    public static App getmInstanceApp(){
        return mInstance;
    }

    public ReactInstanceManager getReactInstanceManager(){
        return mReactInstanceManager;
    }

    public void setReactInstanceManager(ReactInstanceManager reactInstanceManager){
        mReactInstanceManager = reactInstanceManager;
    }
}
