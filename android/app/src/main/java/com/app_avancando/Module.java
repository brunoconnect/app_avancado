package com.app_avancando;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class Module extends ReactContextBaseJavaModule {
    Module(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "TestModule";
    }

    @ReactMethod
    public void teste() {
    
    }
}
