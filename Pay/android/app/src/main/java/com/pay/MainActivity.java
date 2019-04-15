package com.pay;

import com.facebook.react.ReactActivity;
import android.os.Bundle;
import android.util.Log;

//支付的包
import com.switfpass.pay.MainApplication;
import com.switfpass.pay.activity.PayPlugin;
import com.switfpass.pay.bean.RequestMsg;
import com.switfpass.pay.handle.PayHandlerManager;
import com.switfpass.pay.utils.MD5;
import com.switfpass.pay.utils.SignUtils;
import com.switfpass.pay.utils.Util;
import com.switfpass.pay.utils.XmlUtils;

public class MainActivity extends ReactActivity {
    public static MainActivity instance=null;
    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "Pay";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance= this;
        Log.i("tag", "typetag-->" + "ghhhhrhrh");
    }
    public void pay(String token_id) {
//        Log.i("tag", "typetag-->" + "pay");
        RequestMsg msg = new RequestMsg();
        msg.setTokenId(token_id);
        msg.setTradeType(MainApplication.ZFB_APP_TYPE);
        PayPlugin.unifiedAppPay(MainActivity.this, msg);
    }

}
