package com.example.truongnm.mvp.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.truongnm.mvp.R
import com.example.truongnm.mvp.di.component.DaggerActivityComponent
import com.example.truongnm.mvp.di.module.ActivityModule
import com.example.truongnm.mvp.ui.about.AboutFragment
import com.example.truongnm.mvp.ui.list.ListFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()

        presenter.attach(this)
    }

    override fun onResume() {
        super.onResume()
        test()
    }

    override fun showAboutFragment() {
        if (supportFragmentManager.findFragmentByTag(AboutFragment.TAG) == null) {
            supportFragmentManager.beginTransaction()
                    .addToBackStack(null)
                    .setCustomAnimations(AnimType.FADE.getAnimPair().first, AnimType.FADE.getAnimPair().second)
                    .replace(R.id.frame, AboutFragment().newInstance(), AboutFragment.TAG)
                    .commit()
        } else {
            // Maybe an animation like shake hello text
        }
    }

    override fun showListFragment() {
        supportFragmentManager.beginTransaction()
                .disallowAddToBackStack()
                .setCustomAnimations(AnimType.FADE.getAnimPair().first, AnimType.FADE.getAnimPair().second)
                .replace(R.id.frame, ListFragment().newInstance(), ListFragment.TAG)
                .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId) {
            R.id.nav_item_info -> {
                presenter.onDrawerOptionAboutClick()
                return true
            }
            else -> {

            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager
        val fragment = fragmentManager.findFragmentByTag(AboutFragment.TAG)

        if (fragment == null) {
            super.onBackPressed()
        } else {
            supportFragmentManager.popBackStack()
        }
    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        activityComponent.inject(this)
    }

    private fun test() {
        //hello.setText("Hello world with kotlin extensions")
    }

    enum class AnimType {
        SLIDE,
        FADE;

        fun getAnimPair(): Pair<Int, Int> {
            return when(this) {
                SLIDE -> Pair(R.anim.slide_left, R.anim.slide_right)
                FADE -> Pair(R.anim.fade_in, R.anim.fade_out)
            }
        }
    }

}
