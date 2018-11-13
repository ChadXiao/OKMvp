package chad.xiao.mvpkotlin.lce.impl.fragment

import android.os.Bundle
import android.view.View
import chad.xiao.mvpkotlin.MvpFragment
import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.lce.ILceAnimator
import chad.xiao.mvpkotlin.lce.MvpLceView
import chad.xiao.mvpkotlin.lce.MvpLceViewImplCallback
import chad.xiao.mvpkotlin.lce.impl.MvpLceViewImpl

/**
 * Created by Chad.xiao on 2018/11/12 0012 15:03.
 */
abstract class MvpLceFragment<D, V : MvpLceView<D>, P : MvpPresenter<V>> : MvpFragment<V, P>(), MvpLceView<D>, MvpLceViewImplCallback<D>{

    protected var lceViewImpl : MvpLceViewImpl<D>?  = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (lceViewImpl == null){
            lceViewImpl = createMvpLceViewImpl()
        }
        lceViewImpl!!.initView(view)
        lceViewImpl!!.setOnClickErrorListener(View.OnClickListener { onErrorClick() })
    }

    fun setLceAnimator(animator: ILceAnimator){
        lceViewImpl!!.setAnimator(animator)
    }

    private fun onErrorClick(){
        loadData(false)
    }

    override fun showLoading(isPullToRefresh: Boolean) {
        lceViewImpl!!.showLoading(isPullToRefresh)
    }

    override fun showContent(isPullToRefresh: Boolean) {
        lceViewImpl!!.showContent(isPullToRefresh)
    }

    override fun showError(isPullToRefresh: Boolean) {
        lceViewImpl!!.showError(isPullToRefresh)
    }

    override fun loadData(isPullToRefresh: Boolean) {
        lceViewImpl!!.loadData(isPullToRefresh)
    }

    override fun bindData(data: D, isPullToRefresh: Boolean) {
        lceViewImpl!!.bindData(data, isPullToRefresh)
    }

    override fun createMvpLceViewImpl(): MvpLceViewImpl<D> {
        return MvpLceViewImpl()
    }

}