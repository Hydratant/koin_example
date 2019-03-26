package com.sang.koin.view.main

import com.sang.koin.repository.dummy.DummyModel
import com.sang.koin.repository.dummy.DummyRepository

class MainPresenter(private val dummyRepository: DummyRepository) {

    fun get(): MutableList<DummyModel> = dummyRepository.get()
}