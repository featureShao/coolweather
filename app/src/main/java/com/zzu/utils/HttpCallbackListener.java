package com.zzu.utils;

/**
 * Created by KKK on 2017/1/18.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
