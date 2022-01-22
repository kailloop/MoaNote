package kr.co.moanote.presenter

import kr.co.moanote.model.LoginModel

class LoginPresenter(view:Contract.View) : Contract.Presenter {
    private lateinit var view:Contract.View
    private lateinit var loginModel:LoginModel

    init {
        this.view = view
        loginModel = LoginModel(this)
    }
}