package com.composewithbasestructure.app

import android.app.Application
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.os.StrictMode.VmPolicy
import com.composewithbasestructure.util.Constant.DEVELOPER_MODE
import dagger.hilt.android.HiltAndroidApp


/**
 * Created by Sajid.
 */
@HiltAndroidApp
class App : Application() {}