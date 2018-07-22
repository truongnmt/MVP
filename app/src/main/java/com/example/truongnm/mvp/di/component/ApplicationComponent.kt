package com.example.truongnm.mvp.di.component

import com.example.truongnm.mvp.BaseApp
import com.example.truongnm.mvp.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApp)
}