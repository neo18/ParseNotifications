package com.demo.parsenotifications.app;


import android.app.Application;

import com.demo.parsenotifications.helper.ParseUtils;
import com.parse.ParseFacebookUtils;

public class MyApplication extends Application {

    private static MyApplication mInstance;

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        // register with parse
        ParseUtils.registerParse(this);
        ParseFacebookUtils.initialize(this);
    }
}
