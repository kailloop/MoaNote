package kr.co.moanote.util

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import kr.co.moanote.MoaConst
import kr.co.moanote.model.vo.UserData

class MoaPreference(context:Context) {

    private var prefs:SharedPreferences

    init {
        prefs = PreferenceManager.getDefaultSharedPreferences(context)
    }

    fun saveUserInfo(userData:UserData) {
        val editor:SharedPreferences.Editor = this.prefs.edit()
        editor.putString(MoaConst.PREF_USER_ID, userData.id)
        editor.putString(MoaConst.PREF_USER_PW, userData.pw)
        editor.commit()
    }

    fun getUserInfo():UserData {
        val id = prefs.getString(MoaConst.PREF_USER_ID, "").toString()
        val pw = prefs.getString(MoaConst.PREF_USER_PW, "").toString()

        val userData:UserData = UserData(id, pw,"test")
        return userData
    }
}