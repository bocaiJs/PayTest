package com.pay;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.pay.wxapi.WXPayEntryActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomPayPackage  implements ReactPackage{
    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new PayModule(reactContext));
        return modules;
    }
}
