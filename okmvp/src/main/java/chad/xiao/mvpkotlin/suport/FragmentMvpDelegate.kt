package chad.xiao.mvpkotlin.suport

import android.content.Context
import android.os.Bundle
import android.view.View
import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView

/**
 * Created by Chad.xiao on 2018/11/12 0012 11:22.
 */
interface FragmentMvpDelegate<V : MvpView, P : MvpPresenter<V>>{

    fun onAttach(context: Context?)

    fun onCreate(savedInstanceState : Bundle?)

    fun onViewCreated(view : View, savedInstanceState: Bundle?)

    fun onActivityCreate(savedInstanceState: Bundle?)

    fun onStart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestory()

    fun onDetach()

}