package com.example.truongnm.mvp.di.module

import com.example.truongnm.mvp.api.ApiServiceInterface
import com.example.truongnm.mvp.ui.about.AboutContract
import com.example.truongnm.mvp.ui.about.AboutPresenter
import com.example.truongnm.mvp.ui.list.ListContract
import com.example.truongnm.mvp.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {
    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}