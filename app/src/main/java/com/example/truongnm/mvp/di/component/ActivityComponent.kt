package com.example.truongnm.mvp.di.component

import com.example.truongnm.mvp.ui.main.MainActivity
import com.example.truongnm.mvp.di.module.ActivityModule
import dagger.Component

@Component(modules = [(ActivityModule::class)])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}