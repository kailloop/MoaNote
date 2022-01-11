package kr.co.moanote.model

import android.content.Context
import kr.co.moanote.MoaApplication
import kr.co.moanote.model.vo.UserData
import kr.co.moanote.presenter.Contract
import kr.co.moanote.util.MoaPreference

class IntroModel(presenter: Contract.Presenter){
    private var presenter:Contract.Presenter

    init {
        this.presenter = presenter
    }

    fun getUserInfo(context: Context):UserData {
        var userData:UserData = MoaPreference(context).getUserInfo()

        return userData
    }
}