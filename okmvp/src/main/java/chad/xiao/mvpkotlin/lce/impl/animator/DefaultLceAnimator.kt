package chad.xiao.mvpkotlin.lce.impl.animator

import android.view.View
import chad.xiao.mvpkotlin.lce.ILceAnimator

/**
 * Created by Chad.xiao on 2018/11/12 0012 14:23.
 */
class DefaultLceAnimator : ILceAnimator{

    override fun showContentView(loadingView: View, contentView: View, errorView: View) {
        loadingView.visibility      = View.GONE
        contentView.visibility      = View.VISIBLE
        errorView.visibility        = View.GONE
    }

    override fun showLoadingView(loadingView: View, contentView: View, errorView: View) {
        loadingView.visibility      = View.VISIBLE
        contentView.visibility      = View.GONE
        errorView.visibility        = View.GONE
    }

    override fun showErrorView(loadingView: View, contentView: View, errorView: View) {
        loadingView.visibility      = View.GONE
        contentView.visibility      = View.GONE
        errorView.visibility        = View.VISIBLE
    }

}