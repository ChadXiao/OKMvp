package chad.xiao.mvpkotlin.lce

import android.view.View

/**
 * Created by Chad.xiao on 2018/11/12 0012 14:18.
 */
interface ILceAnimator{

    /**
     * 显示加载页面
     * @param loadingView
     * @param contentView
     * @param errorView
     * */
    fun showLoadingView(loadingView : View, contentView : View, errorView: View)

    /**
     * 显示内容页面
     * @param loadingView
     * @param contentView
     * @param errorView
     * */
    fun showContentView(loadingView: View, contentView: View, errorView: View)

    /**
     * 显示错误页面
     * @param loadingView
     * @param contentView
     * @param errorView
     * */
    fun showErrorView(loadingView: View, contentView: View, errorView: View)

}