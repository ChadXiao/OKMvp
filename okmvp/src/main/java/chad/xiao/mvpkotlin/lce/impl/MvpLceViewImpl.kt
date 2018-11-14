package chad.xiao.mvpkotlin.lce.impl

import android.view.View
import chad.xiao.mvpkotlin.R
import chad.xiao.mvpkotlin.lce.ILceAnimator
import chad.xiao.mvpkotlin.lce.MvpLceView
import chad.xiao.mvpkotlin.lce.impl.animator.DefaultLceAnimator

/**
 * Created by Chad.xiao on 2018/11/12 0012 14:26.
 */
open class MvpLceViewImpl<D> : MvpLceView<D>{

    private var animator : ILceAnimator? = null
        get() {
            if (field == null){
                field = DefaultLceAnimator()
            }
            return field
        }

    private var contentView : View?     = null
    private var loadingView : View?     = null
    private var errorView : View?       = null

    fun setAnimator(animator: ILceAnimator?){
        this.animator = animator
    }

    fun initView(rootView : View?){
        if (rootView == null){
            throw NullPointerException("rootView 不能为空")
        }
        if (loadingView == null){
            loadingView = rootView.findViewById(R.id.loadingView)
        }
        if (contentView == null){
            contentView = rootView.findViewById(R.id.contentView)
        }
        if (errorView == null){
            errorView = rootView.findViewById(R.id.errorView)
        }
        if (loadingView == null){
            throw NullPointerException("loadingView 不能为空")
        }
        if (contentView == null){
            throw NullPointerException("contentView 不能为空")
        }
        if (errorView == null){
            throw NullPointerException("errorView 不能为空")
        }
    }

    open fun setOnClickErrorListener(onClickListener : View.OnClickListener){
        errorView!!.setOnClickListener(onClickListener)
    }

    override fun loadData(isPullToRefresh: Boolean) {

    }

    override fun bindData(data: D, isPullToRefresh: Boolean) {

    }

    override fun showLoading(isPullToRefresh: Boolean) {
        if (!isPullToRefresh){
            animator!!.showLoadingView(loadingView!!, contentView!!, errorView!!)
        }
    }

    override fun showContent(isPullToRefresh: Boolean) {
        if (!isPullToRefresh){
            animator!!.showContentView(loadingView!!, contentView!!, errorView!!)
        }
    }

    override fun showError(isPullToRefresh: Boolean) {
        if (!isPullToRefresh){
            animator!!.showErrorView(loadingView!!, contentView!!, errorView!!)
        }
    }





}