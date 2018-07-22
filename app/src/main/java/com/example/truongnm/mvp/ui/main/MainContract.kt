package com.example.truongnm.mvp.ui.main

import com.example.truongnm.mvp.ui.base.BaseContract

class MainContract {
    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}