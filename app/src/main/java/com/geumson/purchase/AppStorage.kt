package com.geumson.purchase

import android.content.Context
import android.content.SharedPreferences


class AppStorage(context: Context) {

    private var pref: SharedPreferences = context.getSharedPreferences("storage", Context.MODE_PRIVATE)

    fun put(key: String?, value: Int) {
        val editor = pref.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun getInt(key: String?): Int {
        return pref.getInt(key, 0)
    }
}