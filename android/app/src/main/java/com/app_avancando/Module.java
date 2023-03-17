package com.app_avancando;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Timer;
import java.util.TimerTask;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class Module extends ReactContextBaseJavaModule {
    Module(ReactApplicationContext context) {
        super(context);
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter mEmitter = null;
    private int count = 0;

    @Override
    public String getName() {
        return "TestModule";
    }

    public void sendEvent(String eventName, String message) {
        WritableMap params = Arguments.createMap();
        params.putString("message", message);
        if( mEmitter == null) {
            mEmitter = getReactApplicationContext().getJSModule((DeviceEventManagerModule.RCTDeviceEventEmitter.class));
        }
        if(mEmitter != null) {
            mEmitter.emit(eventName, params);
        }
    }

    @ReactMethod
    public void teste() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                count++;
                System.out.println("contador" + count);
                sendEvent("count", String.valueOf(count));
            }
        }, 0, 1000);
    }
}
