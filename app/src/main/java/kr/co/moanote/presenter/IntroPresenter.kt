package kr.co.moanote.presenter

import android.content.Context
import kr.co.moanote.model.IntroModel
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity
import kr.co.moanote.view.activity.LoginActivity
import kr.co.moanote.view.activity.MainActivity

class IntroPresenter(view:Contract.View) : Contract.Presenter {
    private var view:Contract.View
    private var introModel:IntroModel

    init {
        this.view = view
        introModel = IntroModel(this)
    }

    fun chkAutoLogin(context: Context): BaseActivity {
        val data = introModel.getUserInfo(context)

        data.id.ifEmpty {
            Util.MOA_LOG("ID가 없어 로그인 화면으로 이동")
            return LoginActivity()
        }
        data.pw.ifEmpty {
            Util.MOA_LOG("PW가 없어 로그인 화면으로 이동")
            return LoginActivity()
        }

        return MainActivity()
    }
}