package chad.xiao.mvpkotlin.suport

import android.os.Bundle
import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView

/**
 * Created by Chad.xiao on 2018/11/12 0012 10:57.
 */
interface ActivityMvpDelegate<V : MvpView, P : MvpPresenter<V>>{

    fun onCreate(savedInstanceState : Bundle?)

    fun onStart()

    fun onRestart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestory()

}