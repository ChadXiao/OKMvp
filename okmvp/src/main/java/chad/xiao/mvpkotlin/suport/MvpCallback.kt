package chad.xiao.mvpkotlin.suport


import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView

/**
 * Created by xiaochuanghai on 2018/3/29.
 */

interface MvpCallback<V : MvpView, P : MvpPresenter<V>> {

    var presenter: P?

    val mvpView: V

    fun createPresenter(): P?

}
