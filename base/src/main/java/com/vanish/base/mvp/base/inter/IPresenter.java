package com.vanish.base.mvp.base.inter;

import androidx.lifecycle.LifecycleEventObserver;

/**
 * Author: vanish
 * Date: 2020/6/19
 * Description: presenter的基类接口
*/
public interface IPresenter extends LifecycleEventObserver {

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();
}
