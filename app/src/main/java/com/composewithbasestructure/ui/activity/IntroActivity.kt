package com.composewithbasestructure.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.composewithbasestructure.core.uI.BaseActivity

class IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        intent = Intent(
            this,
            SplashActivity::class.java
        ).apply {
            intent.extras?.let { putExtras(it) }
        }
        startActivity(intent)
        finish()
    }
}
