package kr.co.moanote.util

import java.text.SimpleDateFormat
import java.util.*

object Format {
    // **************************************************************************
    // Date -> String
    // **************************************************************************

    /*  Date Class에 붙여서 사용 할 수 있는 포맷팅  */
    fun Date.dateToStr(format: String, local: Locale = Locale.getDefault()): String {
        val formatter = SimpleDateFormat(format, local)
        return formatter.format(this)
    }

    /*  String Return  */
    fun dateToStr(date:Date, format: String): String {
        val formatter = SimpleDateFormat(format, Locale.getDefault())
        return formatter.format(date)
    }
}