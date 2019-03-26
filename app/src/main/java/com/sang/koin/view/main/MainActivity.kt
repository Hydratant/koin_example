package com.sang.koin.view.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.sang.koin.R
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val TAG = this.javaClass.simpleName


    private val vm: MainViewModel by viewModel()

    private val presenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter2: MainPresenter = get()

        Log.i(TAG, "mainViewModel : ${vm.get()}")

        Log.i(TAG, "mainPresenter : ${presenter.get()}")

        Log.i(TAG, "mainPresenter2 : ${presenter2.get()}")
    }
}
