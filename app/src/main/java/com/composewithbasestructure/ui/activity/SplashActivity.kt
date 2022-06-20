package com.composewithbasestructure.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.lifecycleScope
import com.composewithbasestructure.core.uI.BaseActivity
import com.composewithbasestructure.ui.theme.ComposeWithBaseStructureTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWithBaseStructureTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Cyan) {
                    lifecycleScope.launch {
                        delay(2000)
                        intent = Intent(this@SplashActivity, MainActivity::class.java).apply {
                            intent.extras?.let { putExtras(it) }
                        }
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }
}