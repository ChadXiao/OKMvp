package chad.xiao.mvpkotlin

import android.app.Activity
import android.os.Bundle
import chad.xiao.mvpkotlin.suport.ActivityMvpDelegate
import chad.xiao.mvpkotlin.suport.ActivityMvpDelegateImpl
import chad.xiao.mvpkotlin.suport.MvpCallback

/**
 * Created by Chad.xiao on 2018/11/12 0012 11:00.
 */
abstract class MvpActivity<V : MvpView, P : MvpPresenter<V>> : Activity(), MvpCallback<V, P>, MvpView{

    private var mvpDelegate : ActivityMvpDelegate<V, P>? = null
        private get() {
            if (field == null){
                field = ActivityMvpDelegateImpl(this)
            }
            return field
        }

    override var presenter : P? = null


    @Suppress("LeakingThis")
    override val mvpView : V = this as V

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        mvpDelegate!!.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        mvpDelegate!!.onStart()
    }

    override fun onResume() {
        super.onResume()
        mvpDelegate!!.onResume()
    }

    override fun onPause() {
        super.onPause()
        mvpDelegate!!.onPause()
    }

    override fun onStop() {
        super.onStop()
        mvpDelegate!!.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mvpDelegate!!.onDestory()
    }

}