package kr.co.moanote.presenter

import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kr.co.moanote.model.LoginModel
import kr.co.moanote.room.user.UserInfo
import kr.co.moanote.room.user.UserServiceImpl
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity

class LoginPresenter(
    view: Contract.View,
    private val userServiceImpl: UserServiceImpl
) : Contract.Presenter {
    private lateinit var view: Contract.View
    private lateinit var loginModel: LoginModel
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    init {
        this.view = view
        loginModel = LoginModel(view, userServiceImpl)
    }

    suspend fun login(id:String, pw:String): BaseActivity? {   // 로그인
        var userData:UserInfo

        coroutineScope.launch {
            try{
                userData = loginModel.chkUserData(id, pw)

            }catch (e:NullPointerException) {
                Util.MOA_LOG(e.toString())
            }
        }

        return null
    }

    fun registerUser() {    // 회원가입

    }
}