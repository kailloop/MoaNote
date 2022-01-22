package kr.co.moanote.util

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import kr.co.moanote.MoaConst
import kr.co.moanote.room.user.UserInfo

class MoaPreference(context:Context) {

    private var prefs:SharedPreferences

    init {
        prefs = PreferenceManager.getDefaultSharedPreferences(context)
    }

    fun saveUserInfo(userInfo: UserInfo) {
        val editor:SharedPreferences.Editor = this.prefs.edit()
        editor.putString(MoaConst.PREF_USER_ID, userInfo.id)
        editor.putString(MoaConst.PREF_USER_PW, userInfo.pw)
        editor.commit()
    }

    fun getUserInfo(): UserInfo {
        val id = prefs.getString(MoaConst.PREF_USER_ID, "").toString()
        val pw = prefs.getString(MoaConst.PREF_USER_PW, "").toString()

        val userInfo: UserInfo = UserInfo(id, pw,"test")
        return userInfo
    }
}