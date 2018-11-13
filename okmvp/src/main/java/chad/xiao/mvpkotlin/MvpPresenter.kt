package chad.xiao.mvpkotlin

/**
 * Created by Chad.xiao on 2018/11/12 0012 10:36.
 */
interface MvpPresenter <V : MvpView>{

    fun attachView(view : V)

    fun detachView()

}