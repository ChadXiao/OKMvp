package chad.xiao.mvpkotlin

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.View
import chad.xiao.mvpkotlin.suport.FragmentMvpDelegate
import chad.xiao.mvpkotlin.suport.FragmentMvpDelegateImpl
import chad.xiao.mvpkotlin.suport.MvpCallback

/**
 * Created by Chad.xiao on 2018/11/12 0012 12:13.
 */
abstract class MvpFragment<V : MvpView, P : MvpPresenter<V>> : Fragment(), MvpView, MvpCallback<V, P>{

    private var mvpDelegate : FragmentMvpDelegate<V, P>? = null
        private get(){
            if (field == null){
                field = FragmentMvpDelegateImpl(this)
            }
            return field
        }

    override var presenter : P? = null

    @Suppress("LeakingThis")
    override val mvpView : V = this as V

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mvpDelegate!!.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mvpDelegate!!.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mvpDelegate!!.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mvpDelegate!!.onActivityCreate(savedInstanceState)
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

    override fun onDetach() {
        super.onDetach()
        mvpDelegate!!.onDetach()
    }

    abstract override fun createPresenter() : P?



}