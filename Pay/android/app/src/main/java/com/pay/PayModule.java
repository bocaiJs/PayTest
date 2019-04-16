package com.pay;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.util.Map;
import java.util.HashMap;




public class PayModule extends ReactContextBaseJavaModule {
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";
    public static PayModule instance=null;
    public PayModule(ReactApplicationContext reactContext) {

        super(reactContext);
        instance = this;
    }
    @Override
    public String getName() {
        return "PayKuaiKou";
    }
    @ReactMethod
    public void pay(String token_id) {
        MainActivity.instance.pay(token_id);
        Toast.makeText(getReactApplicationContext(), token_id, Toast.LENGTH_LONG).show();
    }
    @ReactMethod
    public void sendResult(int Code){
        this.getReactApplicationContext()
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit("Pay_Resp", Code);
    }
}
