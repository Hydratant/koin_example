package com.sang.koin

import com.sang.koin.view.main.MainPresenter
import org.koin.core.KoinComponent
import org.koin.core.get
import org.koin.core.inject

class Test : KoinComponent {


    val test1: MainPresenter by inject()

    val test2: MainPresenter = get()
}