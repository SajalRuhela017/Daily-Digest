package com.androiddevs.dailydigest.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.androiddevs.dailydigest.models.NewsResponse
import com.androiddevs.dailydigest.repository.NewsRepository
import com.androiddevs.dailydigest.util.Resource

class NewsViewModel(val newsRepository: NewsRepository) : ViewModel(){

    val breakingNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
}