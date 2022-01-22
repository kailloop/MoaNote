package kr.co.moanote.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kr.co.moanote.presenter.Contract
import kr.co.moanote.util.Util

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener, Contract.View {

    abstract fun createActivity()
    abstract fun pauseActivity()
    abstract fun resumeActivity()
    abstract fun destroyActivity()

    abstract fun viewClick(v: View?)

    // *****************************************************************************
    // LIFE CYCLE
    // *****************************************************************************
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Util.MOA_LOG("Execute onCreate()")
        this.createActivity()
    }

    override fun onPause() {
        super.onPause()
        Util.MOA_LOG("Execute onPause()")
        this.pauseActivity()
    }

    override fun onResume() {
        super.onResume()
        Util.MOA_LOG("Execute onResume()")
        this.resumeActivity()
    }

    override fun onDestroy() {
        super.onDestroy()
        Util.MOA_LOG("Execute onDestroy()")
        this.destroyActivity()
    }

    // *****************************************************************************
    // EVENT
    // *****************************************************************************
    override fun onClick(v: View?) {
        this.viewClick(v)
    }
}