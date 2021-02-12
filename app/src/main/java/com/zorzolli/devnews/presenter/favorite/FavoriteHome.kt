package com.zorzolli.devnews.presenter.favorite

import com.zorzolli.devnews.model.Article

interface FavoriteHome {

    interface Presenter {
        fun onSuccess(articles: List<Article>)
    }
}