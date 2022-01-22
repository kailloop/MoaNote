package kr.co.moanote.model

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.take
import kr.co.moanote.room.user.UserInfo
import kr.co.moanote.presenter.Contract
import kr.co.moanote.presenter.LoginPresenter
import kr.co.moanote.room.user.UserServiceImpl

class LoginModel(
    private val presenter: Contract.View,
    private val userServiceImpl: UserServiceImpl
) {
    private var loginPresenter: LoginPresenter

    init {
        loginPresenter = presenter as LoginPresenter
    }

    fun saveUserData(userInfo: UserInfo) {
        // Login
    }

    suspend fun chkUserData(id:String, pw:String): UserInfo {
        var result: UserInfo = UserInfo("", "", "")
        var userData = userServiceImpl.getUserData()

        userData.collect {
            if(it.size != 0){
                it.forEach {
                    result = it
                }
            }
        }

        return result
    }
}