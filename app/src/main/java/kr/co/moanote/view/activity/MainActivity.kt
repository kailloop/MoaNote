package kr.co.moanote.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kr.co.moanote.R
import kr.co.moanote.presenter.Contract
import kr.co.moanote.presenter.MainPresenter
import kr.co.moanote.util.Util
import kr.co.moanote.view.BaseActivity

class MainActivity : BaseActivity() {
    private lateinit var presenter: Contract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Util.MOA_LOG("On MainActivity")
        presenter = MainPresenter(this)
    }

    override fun createActivity() {

    }

    override fun pauseActivity() {

    }

    override fun resumeActivity() {

    }

    override fun destroyActivity() {

    }

    override fun viewClick(v: View?) {

    }
}