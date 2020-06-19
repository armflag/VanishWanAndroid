package com.vanish.base.mvp.base;

import com.vanish.base.mvp.base.inter.IModel;
import com.vanish.base.mvp.base.inter.IView;

/**
 * Author: vanish
 * Date: 2020/6/19
 * Description: present的基类
 */
public abstract class BasePresenter<T extends IView, M extends IModel> extends Presenter {
    /**
     * model对象
     */
    protected M mModel;
    /**
     * view对象
     */
    protected T mView;

    public BasePresenter(T view) {
        this.mView = view;
        this.mModel = initModel();
    }

    @Override
    public void onCreate() {
        super.onCreate();//先执行init()
        if (mModel != null) {
            mModel.setLifecycle(lifecycle); //将lifecycle设置到model, model请求时回调回来
        }
    }

    /**
     * 初始化model对象
     *
     * @return
     */
    protected abstract M initModel();

}
