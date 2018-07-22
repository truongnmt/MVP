package com.example.truongnm.mvp.di.module

import android.app.Application
import com.example.truongnm.mvp.BaseApp
import com.example.truongnm.mvp.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {
    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}