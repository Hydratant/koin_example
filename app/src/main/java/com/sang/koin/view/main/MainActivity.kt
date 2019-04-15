package com.sang.koin.view.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.sang.koin.R
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val TAG = this.javaClass.simpleName


    private val vm: MainViewModel by viewModel()

    private val presenter: MainPresenter by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.i(TAG, "mainViewModel : ${vm.get()}")

        Log.i(TAG, "mainPresenter : ${presenter.get()}")

    }

    override fun onDestroy() {
        super.onDestroy()

    }
}
