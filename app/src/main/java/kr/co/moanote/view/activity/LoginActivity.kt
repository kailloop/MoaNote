package kr.co.moanote.view.activity

import android.view.View
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kr.co.moanote.R
import kr.co.moanote.databinding.ActivityIntroBinding
import kr.co.moanote.databinding.ActivityLoginBinding
import kr.co.moanote.presenter.Contract
import kr.co.moanote.presenter.LoginPresenter
import kr.co.moanote.room.user.UserInfo
import kr.co.moanote.room.user.UserServiceImpl
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity
import org.koin.android.ext.android.get

class LoginActivity : BaseActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    private lateinit var presenter: Contract.Presenter
    private var userServiceImpl: UserServiceImpl = get()

    // *****************************************************************************
    // LIFE CYCLE
    // *****************************************************************************
    override fun createActivity() {
        setContentView(R.layout.activity_login)
        Util.MOA_LOG("On LoginActivity")
        presenter = LoginPresenter(this, userServiceImpl)

        init()
    }

    override fun pauseActivity() {

    }

    override fun resumeActivity() {

    }

    override fun destroyActivity() {

    }

    fun init() {
        binding.btnLogin.setOnClickListener(this)
    }

    // *****************************************************************************
    // EVENT
    // *****************************************************************************
    override fun viewClick(v: View?) {
        when(v) {
            binding.btnLogin -> {
                (presenter as LoginPresenter).login(binding.txtId.text.toString(), binding.txtPw.text.toString())
            }
        }
    }


}