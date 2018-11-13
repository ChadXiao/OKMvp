package chad.xiao.mvpkotlin.suport

import android.os.Bundle
import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView

/**
 * Created by Chad.xiao on 2018/11/12 0012 11:06.
 */
class ActivityMvpDelegateImpl<V : MvpView, P : MvpPresenter<V>> : ActivityMvpDelegate<V, P>{

    private val proxyMvpCallback : ProxyMvpCallback<V, P>

    constructor(mvpCallback: MvpCallback<V, P>){
        proxyMvpCallback = ProxyMvpCallback(mvpCallback)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        proxyMvpCallback.createPresenter()
        proxyMvpCallback.attachView()
    }

    override fun onStart() {

    }

    override fun onRestart() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestory() {
        proxyMvpCallback.detachView()
    }

}