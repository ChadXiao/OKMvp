package chad.xiao.mvpkotlin

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import chad.xiao.mvpkotlin.suport.ActivityMvpDelegate
import chad.xiao.mvpkotlin.suport.ActivityMvpDelegateImpl
import chad.xiao.mvpkotlin.suport.MvpCallback

/**
 * Created by Chad.xiao on 2018/11/12 0012 12:28.
 */
abstract class MvpFragmentActivity<V : MvpView, P : MvpPresenter<V>> : FragmentActivity(), MvpCallback<V, P>, MvpView{

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

    abstract override fun createPresenter() : P?

    override fun onCreate(savedInstanceState: Bundle?) {
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