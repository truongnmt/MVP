package com.example.truongnm.mvp.di.component

import com.example.truongnm.mvp.MainActivity
import com.example.truongnm.mvp.di.module.ActivityModule
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}