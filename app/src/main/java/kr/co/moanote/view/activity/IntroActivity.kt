package kr.co.moanote.view.activity

import android.animation.Animator
import android.content.Intent
import android.os.Handler
import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kr.co.moanote.R
import kr.co.moanote.databinding.ActivityIntroBinding
import kr.co.moanote.presenter.Contract
import kr.co.moanote.presenter.IntroPresenter
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity

class IntroActivity : BaseActivity() {

    private val binding by lazy { ActivityIntroBinding.inflate(layoutInflater) }
    private lateinit var presenter: IntroPresenter

    // *****************************************************************************
    // LIFE CYCLE
    // *****************************************************************************
    override fun createActivity() {
        setContentView(binding.root)
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
        binding.lottieIntro.setOnClickListener(this)
        binding.bgIntro.setOnClickListener(this)
        binding.lottieIntro.playAnimation()
        binding.lottieIntro.apply {
            progress = 0f
        }

        binding.lottieIntro.addAnimatorListener(object:Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        })

        // goScreen()
    }

    // *****************************************************************************
    // EVENT
    // *****************************************************************************
    override fun viewClick(v: View?) {
        when(v) {
            binding.lottieIntro -> {
                Util.MOA_LOG("작동 확인")
                binding.lottieIntro.progress = 0f
            }
            binding.bgIntro -> {
                Util.MOA_LOG("배경 확인")
            }
        }
    }

    // *****************************************************************************
    // FUNC
    // *****************************************************************************
    private fun goScreen() {
        var login:BaseActivity = presenter.chkAutoLogin(this@IntroActivity)

        var handler = Handler()
        handler.postDelayed(Runnable {
            startActivity(Intent(this@IntroActivity, login::class.java))
            overridePendingTransition(0, 0)
            finish()
        }, 3000)
    }
}