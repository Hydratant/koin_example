package com.sang.koin.view.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context
import com.sang.koin.repository.dummy.DummyModel
import com.sang.koin.repository.dummy.DummyRepository

class MainViewModel(
        private val ap: Application,
        private val dummyRepository: DummyRepository) : AndroidViewModel(ap) {

    fun get(): MutableList<DummyModel> {
        val context: Context = ap.applicationContext

        return dummyRepository.get()
    }
}