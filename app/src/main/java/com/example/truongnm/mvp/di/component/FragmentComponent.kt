package com.example.truongnm.mvp.di.component

import com.example.truongnm.mvp.di.module.FragmentModule
import com.example.truongnm.mvp.ui.about.AboutFragment
import com.example.truongnm.mvp.ui.list.ListFragment
import dagger.Component

@Component(modules = [(FragmentModule::class)])
interface FragmentComponent {
    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)
}