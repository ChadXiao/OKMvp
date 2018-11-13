package chad.xiao.mvpkotlin.lce

import chad.xiao.mvpkotlin.lce.impl.MvpLceViewImpl

/**
 * Created by Chad.xiao on 2018/11/12 0012 17:13.
 */
interface MvpLceViewImplCallback<D>{

    fun createMvpLceViewImpl() : MvpLceViewImpl<D>

}