package com.composewithbasestructure.repository

import android.content.Context
import com.composewithbasestructure.data.remote.model.response.PostResponse
import com.composewithbasestructure.network.ApiRestService
import com.composewithbasestructure.network.SafeApiRequest
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class DemoRepository @Inject constructor(
    @ApplicationContext context: Context,
    private val api: ApiRestService
) : SafeApiRequest(context) {

    suspend fun getWeather(): PostResponse {
        return apiRequest { api.getWeather() }
    }
}