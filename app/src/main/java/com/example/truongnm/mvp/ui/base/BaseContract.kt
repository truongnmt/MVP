package com.example.truongnm.mvp.ui.base

class BaseContract {
    interface Presenter<in T> {
        fun subcribe()
        fun unsubcribe()
        fun attach(view: T)
    }

    interface View {

    }
}