package com.example.binusapp.util

import android.app.AlertDialog
import android.content.Context
import com.example.binusapp.R

class LoadingDialog(private val context: Context) {
    private var alertDialog: AlertDialog? = null

    fun showLoading() {
        val builder = AlertDialog.Builder(context)
        builder.setView(R.layout.progress_dialog) // Custom layout for progress dialog

        alertDialog = builder.create()
        alertDialog?.setCancelable(false)
        alertDialog?.show()
    }

    fun hideLoading() {
        alertDialog?.dismiss()
    }
}
