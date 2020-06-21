package com.peacedude.besttoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.peacedude.gdtoast.gdToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
//        gdToast(
//            "Hello world",
//            R.drawable.ic_android_black_24dp,
//            "#6200EE",
//            R.color.colorAccent,
//            Gravity.BOTTOM,
//            Toast.LENGTH_LONG
//        )

        gdToast("Hello world", Gravity.CENTER)
//        gdErrorToast("This is an error message and it is very very long", Gravity.CENTER_HORIZONTAL)

    }
}
