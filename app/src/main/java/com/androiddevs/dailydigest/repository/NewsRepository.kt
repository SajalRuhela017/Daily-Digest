package com.androiddevs.dailydigest.repository

import com.androiddevs.dailydigest.api.RetrofitInstance
import com.androiddevs.dailydigest.db.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}