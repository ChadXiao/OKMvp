package chad.xiao.mvpkotlin.suport

import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView

/**
 * Created by Chad.xiao on 2018/11/12 0012 10:44.
 */
class ProxyMvpCallback<V : MvpView, P : MvpPresenter<V>>(private val mvpCallback : MvpCallback<V, P>) : MvpCallback<V, P>{

    override fun createPresenter(): P {
        var presenter = mvpCallback.presenter
        if (presenter == null){
            presenter = mvpCallback.createPresenter()
        }
        if (presenter == null){
            throw NullPointerException("P层不能为空")
        }
        mvpCallback.presenter = presenter
        return presenter
    }

    override var presenter: P?
        get() = mvpCallback.presenter
        set(value) {
            mvpCallback.presenter = value
        }

    override val mvpView
        get() = mvpCallback.mvpView

    fun attachView(){
        presenter!!.attachView(mvpView)
    }

    fun detachView(){
        presenter!!.detachView()
    }

}