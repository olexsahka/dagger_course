@file:Suppress("UNUSED_PARAMETER")

package dev.androidbroadcast.dagger.data

import android.content.Context
import javax.inject.Inject

class Analytics @Inject constructor() {

    fun trackScreenShow() {
    }

    fun trackNewsRequest(newsId: String) {
        // Do nothing
    }
}