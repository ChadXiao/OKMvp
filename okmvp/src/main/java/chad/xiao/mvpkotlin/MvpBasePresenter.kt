package chad.xiao.mvpkotlin

/**
 * Created by Chad.xiao on 2018/11/12 0012 12:01.
 */
abstract class MvpBasePresenter<V : MvpView, M : MvpModel> : MvpPresenter<V>{

    var view : V? = null
        private set

    protected var model : M? = null
        protected get() {
            if (field == null){
                field = createModel()
            }
            if (field == null){
                throw NullPointerException("model不能为空")
            }
            return field
        }
        private set

    constructor(){
        model = createModel()
    }

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }

    abstract fun createModel() : M

}