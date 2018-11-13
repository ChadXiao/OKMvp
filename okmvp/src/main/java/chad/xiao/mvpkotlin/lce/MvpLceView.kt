package chad.xiao.mvpkotlin.lce

import chad.xiao.mvpkotlin.MvpView

/**
 * Created by Chad.xiao on 2018/11/12 0012 14:16.
 */
interface MvpLceView<D> : MvpView {

    fun loadData(isPullToRefresh : Boolean)

    fun showLoading(isPullToRefresh : Boolean)

    fun showContent(isPullToRefresh : Boolean)

    fun bindData(data : D, isPullToRefresh : Boolean)

    fun showError(isPullToRefresh : Boolean)

}