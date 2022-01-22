package kr.co.moanote.model

import android.content.Context
import kr.co.moanote.room.user.UserInfo
import kr.co.moanote.presenter.Contract
import kr.co.moanote.util.MoaPreference

class IntroModel(
    presenter: Contract.Presenter
) {
    private var presenter:Contract.Presenter

    init {
        this.presenter = presenter
    }

    fun getUserInfo(context: Context): UserInfo {
        var userInfo: UserInfo = MoaPreference(context).getUserInfo()

        return userInfo
    }
}