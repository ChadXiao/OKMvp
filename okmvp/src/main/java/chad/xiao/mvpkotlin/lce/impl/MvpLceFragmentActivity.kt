package chad.xiao.mvpkotlin.lce.impl

import chad.xiao.mvpkotlin.MvpFragmentActivity
import chad.xiao.mvpkotlin.MvpPresenter
import chad.xiao.mvpkotlin.MvpView
import chad.xiao.mvpkotlin.R
import chad.xiao.mvpkotlin.lce.ILceAnimator
import chad.xiao.mvpkotlin.lce.MvpLceView
import chad.xiao.mvpkotlin.lce.MvpLceViewImplCallback

/**
 * Created by Chad.xiao on 2018/11/12 0012 14:58.
 */
abstract class MvpLceFragmentActivity<D, V : MvpView, P : MvpPresenter<V>> : MvpFragmentActivity<V, P>(), MvpLceView<D>, MvpLceViewImplCallback<D> {
    protected var mvpLceView : MvpLceViewImpl<D>? = null
        get() {
            if (field == null){
                field = createMvpLceViewImpl()
            }
            return field
        }

    override fun onContentChanged() {
        super.onContentChanged()
        mvpLceView!!.initView(findViewById(R.id.rootView))
    }

    fun onErrorClick(){
        loadData(false)
    }

    fun setLceAnimator(animator: ILceAnimator?){
        mvpLceView!!.setAnimator(animator)
    }

    override fun loadData(isPullToRefresh: Boolean) {
        mvpLceView!!.loadData(isPullToRefresh)
        mvpLceView!!.showLoading(isPullToRefresh)
    }

    override fun bindData(data: D, isPullToRefresh: Boolean) {
        mvpLceView!!.bindData(data, isPullToRefresh)
    }

    override fun showLoading(isPullToRefresh: Boolean) {
        mvpLceView!!.showLoading(isPullToRefresh)
    }

    override fun showContent(isPullToRefresh: Boolean) {
        mvpLceView!!.showContent(isPullToRefresh)
    }

    override fun showError(isPullToRefresh: Boolean) {
        mvpLceView!!.showError(isPullToRefresh)
    }

    override fun createMvpLceViewImpl(): MvpLceViewImpl<D> {
        return MvpLceViewImpl()
    }
}