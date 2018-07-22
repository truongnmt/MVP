package com.example.truongnm.mvp.ui.list

import com.example.truongnm.mvp.models.DetailsViewModel
import com.example.truongnm.mvp.models.Post
import com.example.truongnm.mvp.ui.base.BaseContract

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}