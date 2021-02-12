package com.zorzolli.devnews.presenter

import com.zorzolli.devnews.model.Article

interface ViewHome {

    interface View {
        fun showProgressBar()
        fun showFailure(message: String)
        fun hideProgressBar()
        fun showArtciles(articles: List<Article>)
    }

    interface Favorite {
        fun showArtciles(articles: List<Article>)
    }
}