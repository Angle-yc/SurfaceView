package com.angle.day36practice;

import android.app.Application;

import org.xutils.x;

/**
 * Created by XaChya on 2016/10/27.
 */

public class BaseApplication extends Application{

    //application对象创建时回调
    //一般在这里初始化各种模块、SDK、对象。
    @Override
    public void onCreate() {
        super.onCreate();
        //xutils初始化，一定要调用。
        x.Ext.init(this);
        MyImageCacheSoftReference.getInstance();
    }
}
