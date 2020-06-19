package com.vanish.base.mvp.base;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import com.vanish.base.mvp.base.inter.IPresenter;

/**
 * Author: vanish
 * Date: 2020/6/19
 * Description: presenter抽象类，提供给实现类使用
 */
public abstract class Presenter implements IPresenter {

    protected Lifecycle lifecycle;

    public abstract void init();

    @Override
    public void onCreate() {
        init();
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void onDestroy() {
    }
    public Lifecycle getLifecycle() {
        return lifecycle;
    }
    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        switch (event) {
            case ON_CREATE:
                lifecycle = source.getLifecycle();
                onCreate();
                break;
            case ON_START:
                onStart();
                break;
            case ON_STOP:
                onStop();
                break;
            case ON_PAUSE:
                onPause();
                break;
            case ON_RESUME:
                onResume();
                break;
            case ON_DESTROY:
                source.getLifecycle().removeObserver(this);
                onDestroy();
                break;
            default:
                break;
        }
    }
}
