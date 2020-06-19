package com.vanish.base.mvp.base.inter;
/**
 * Author: vanish
 * Date: 2020/6/19
 * Description: view接口
*/
public interface IView {
    /**
     * 显示加载框
     */
    void showLoadingDialog();

    /**
     * 隐藏加载框
     */
    void hideLoadingDialog();
}
