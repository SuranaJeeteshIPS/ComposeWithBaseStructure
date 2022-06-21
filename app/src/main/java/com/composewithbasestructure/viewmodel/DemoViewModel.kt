package com.composewithbasestructure.viewmodel

import android.util.Log
import com.composewithbasestructure.core.uI.BaseViewModel
import com.composewithbasestructure.network.ApiException
import com.composewithbasestructure.repository.DemoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by JeeteshSurana.
 */

@HiltViewModel
class DemoViewModel @Inject constructor(
    private val repository: DemoRepository/*,
    private val context: Application*/
) : BaseViewModel() {

    suspend fun getData() = withContext(Dispatchers.Main) {
        try {
            val data = repository.getWeather()
            Log.e("TAG", "getData() data--> $data")
        } catch (e: ApiException) {
            e.printStackTrace()
        }
    }
}