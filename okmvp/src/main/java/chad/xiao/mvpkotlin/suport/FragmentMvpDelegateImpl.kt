package chad.xiao.mvpkotlin.suport

import android.content.Context
import android.os.Bundle
import android.view.View
import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView

/**
 * Created by Chad.xiao on 2018/11/12 0012 11:54.
 */
class FragmentMvpDelegateImpl<V : MvpView, P : MvpPresenter<V>> : FragmentMvpDelegate<V, P>{

    private val proxyMvpCallback : ProxyMvpCallback<V, P>

    constructor(mvpCallback: MvpCallback<V, P>){
        proxyMvpCallback = ProxyMvpCallback(mvpCallback)
    }

    override fun onAttach(context: Context?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        proxyMvpCallback.createPresenter()
        proxyMvpCallback.attachView()
    }

    override fun onActivityCreate(savedInstanceState: Bundle?) {

    }

    override fun onStart() {

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

    override fun onDetach() {

    }



}