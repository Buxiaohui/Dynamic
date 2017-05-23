package com.test.dynamic.dyclass;

/**
 * Created by buxiaohui on 5/23/17.
 */

import android.app.Activity;
import android.widget.Toast;

import com.test.dynamic.dyinterface.IDynamic;

/**
 * 动态类的实现
 */
public class DynamicImpl implements IDynamic {


    private Activity mActivity;

    @Override
    public void init(Activity activity) {
        mActivity = activity;
    }

    @Override
    public void showBanner() {
        Toast.makeText(mActivity, "我是ShowBannber方法", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialog() {
        Toast.makeText(mActivity, "我是ShowDialog方法", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFullScreen() {
        Toast.makeText(mActivity, "我是ShowFullScreen方法", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAppWall() {
        Toast.makeText(mActivity, "我是ShowAppWall方法", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void destory() {
    }


}
