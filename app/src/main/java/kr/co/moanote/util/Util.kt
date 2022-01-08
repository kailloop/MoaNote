package kr.co.moanote.util

import android.util.Log
import kr.co.moanote.MoaConst

object Util {
    fun MOA_LOG(content:String) {
        if(MoaConst.DEBUG_MODE) {
            Log.e("MOA_LOG", content)
        }
    }


}