package com.zorzolli.devnews.presenter.favorite

import com.zorzolli.devnews.model.Article
import com.zorzolli.devnews.model.data.NewsDataSource
import com.zorzolli.devnews.presenter.ViewHome

class FavoritePresenter(val view: ViewHome.Favorite, private val dataSource: NewsDataSource): FavoriteHome.Presenter {

    fun getAll() {
        this.dataSource.getAllArticle(this)
    }

    fun saveArticle(article: Article) {
        this.dataSource.saveArticle(article)
    }

    fun deleteArticle(article: Article) {
        this.dataSource.deleteArticle(article)
    }

    override fun onSuccess(articles: List<Article>) {
        this.view.showArtciles(articles)
    }
}