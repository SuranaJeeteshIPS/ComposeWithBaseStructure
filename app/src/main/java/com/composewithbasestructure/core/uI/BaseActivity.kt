package com.composewithbasestructure.core.uI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.composewithbasestructure.util.extensionFunction.hideKeyboard
import com.composewithbasestructure.util.extensionFunction.setTheme

/**
 * Created by JeeteshSurana.
 */

abstract class BaseActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.setTheme()
    }

    override fun onPause() {
        hideKeyboard()
        super.onPause()
    }

    override fun onDestroy() {
        hideKeyboard()
        super.onDestroy()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window?.setTheme()
        }
    }
}