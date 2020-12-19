package com.android.newsapp.models

import com.android.newsapp.models.Article

data class NewsResponse(
        val articles: List<Article>,
        val status: String,
        val totalResults: Int
)