package com.android.newsapp.models

import com.android.newsapp.models.Article

data class NewsResponse(
        val articles: MutableList<Article>,
        val status: String,
        val totalResults: Int
)