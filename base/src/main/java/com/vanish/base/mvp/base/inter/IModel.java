package com.vanish.base.mvp.base.inter;

import androidx.lifecycle.Lifecycle;

/**
 * Author: vanish
 * Date: 2020/6/19
 * Description: model接口
*/
public interface IModel {
    /**
     * 获取lifecycle对象
     * @return
     */
    Lifecycle getLifecycle();
    /**
     * @param lifecycle
     */
    void setLifecycle(Lifecycle lifecycle);


    void onDestroy();
}

