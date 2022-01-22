package kr.co.moanote.model

import kr.co.moanote.model.vo.UserData
import kr.co.moanote.presenter.Contract

class LoginModel(presenter:Contract.Presenter) {
    private lateinit var presenter:Contract.Presenter

    init {
        this.presenter = presenter
    }

    fun saveUserData(userData: UserData) {
        // Login
    }
}