package com.test.dynamic.dyinterface;

/**
 * Created by buxiaohui on 5/23/17.
 */

import android.app.Activity;

/**
 * 动态加载类的接口
 */
public interface IDynamic {
    /**
     * 初始化方法
     */
    public void init(Activity activity);

    /**
     * 自定义方法
     */
    public void showBanner();

    public void showDialog();

    public void showFullScreen();

    public void showAppWall();

    /**
     * 销毁方法
     */
    public void destory();
}