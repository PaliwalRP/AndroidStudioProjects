package com.example.configurechangeskotlin

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MyApplication"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate()")

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // [ ... React to different orientation ... ]\
            Log.d(TAG, "Orientation Landscape")
        }

        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {
            // [ ... React to changed keyboard visibility ... ]
            Log.d(TAG, "Orientation Landscape")
        }

    }
}

