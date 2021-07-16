package com.example.myownandroidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastdisplay.Abstractions
import com.example.toastdisplay.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add Dependency
        Toaster.simpleToast(this, "Hello World")
        Toaster.Toaster2.simpleToast(this)

    }
}