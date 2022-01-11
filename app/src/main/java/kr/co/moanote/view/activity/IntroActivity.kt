package kr.co.moanote.view.activity

import android.content.Intent
import android.view.View
import kr.co.moanote.R
import kr.co.moanote.databinding.ActivityIntroBinding
import kr.co.moanote.presenter.Contract
import kr.co.moanote.presenter.IntroPresenter
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity

class IntroActivity : BaseActivity(), Contract.View {

    private val binding by lazy { ActivityIntroBinding.inflate(layoutInflater) }
    private lateinit var presenter: IntroPresenter

    // *****************************************************************************
    // LIFE CYCLE
    // *****************************************************************************
    override fun createActivity() {
        setContentView(R.layout.activity_intro)
        presenter = IntroPresenter(this)

        init()
    }

    override fun pauseActivity() {

    }

    override fun resumeActivity() {

    }

    override fun destroyActivity() {

    }

    // *****************************************************************************
    // INIT UI
    // *****************************************************************************
    private fun init() {
        goScreen()
    }

    // *****************************************************************************
    // EVENT
    // *****************************************************************************
    override fun viewClick(v: View?) {

    }

    // *****************************************************************************
    // FUNC
    // *****************************************************************************
    private fun goScreen() {
        val login = presenter.chkAutoLogin(this)

        startActivity(Intent(this, login::class.java))
    }
}