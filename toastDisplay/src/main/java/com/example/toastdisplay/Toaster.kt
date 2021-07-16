package com.example.toastdisplay

import android.content.Context
import android.util.Log
import android.widget.Toast

object Toaster :Abstractions(){
    fun simpleToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        Log.d("displayToast", "simpleToast:1")
    }

    object Toaster2 {
        fun simpleToast(context: Context) {
            Toast.makeText(context, "Inside Toaster", Toast.LENGTH_SHORT).show()
            Log.d("displayToasts", "simpleToast: 2")
        }
    }
}
