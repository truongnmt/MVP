package com.example.truongnm.mvp.di.module

import android.app.Activity
import com.example.truongnm.mvp.ui.main.MainContract
import com.example.truongnm.mvp.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {
    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }
}