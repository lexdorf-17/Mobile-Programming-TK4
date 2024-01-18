package com.example.binusapp.data.prefs

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.example.binusapp.data.network.Constants

class AppPreferences(context: Context) {
    private val mainKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
    private val mPrefs: SharedPreferences = EncryptedSharedPreferences.create(
        Constants.PREF_NAME,
        mainKeyAlias,
        context,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    fun setUserName(value: String) =
        mPrefs.edit().putString(Constants.PREF_USER_NAME, value).apply()

    fun getUserName(): String? = mPrefs.getString(Constants.PREF_USER_NAME, "")

    fun setEmail(value: String) =
        mPrefs.edit().putString(Constants.PREF_EMAIL, value).apply()

    fun getEmail(): String? = mPrefs.getString(Constants.PREF_EMAIL, "")

    fun isLogin(): Boolean = mPrefs.getBoolean(Constants.PREF_LOGIN_STATUS, false)
    fun setLogin(login: Boolean) =
        mPrefs.edit().putBoolean(Constants.PREF_LOGIN_STATUS, login).apply()

}

