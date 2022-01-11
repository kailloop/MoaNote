package kr.co.moanote.view.activity

import android.view.View
import kr.co.moanote.R
import kr.co.moanote.presenter.Contract
import kr.co.moanote.presenter.LoginPresenter
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity

class LoginActivity : BaseActivity(), Contract.View {

    private lateinit var presenter: Contract.Presenter

    // *****************************************************************************
    // LIFE CYCLE
    // *****************************************************************************
    override fun createActivity() {
        setContentView(R.layout.activity_login)
        Util.MOA_LOG("On LoginActivity")
        presenter = LoginPresenter(this)
    }

    override fun pauseActivity() {

    }

    override fun resumeActivity() {

    }

    override fun destroyActivity() {

    }

    // *****************************************************************************
    // EVENT
    // *****************************************************************************
    override fun viewClick(v: View?) {

    }
}