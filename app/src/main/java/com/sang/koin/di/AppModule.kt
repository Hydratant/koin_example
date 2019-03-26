package com.sang.koin.di

import android.util.Log
import com.sang.koin.repository.dummy.DummyRepository
import com.sang.koin.repository.dummy.DummyRepositoryImpl
import com.sang.koin.view.main.MainPresenter
import com.sang.koin.view.main.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {


    // inject 할때마다 객체 생성
    factory {
        val test = getProperty<String>("BASE_URL")
        val test2 = getProperty<Int>("TEST")
//        val test3 = getProperty<Boolean>("GG")
//
//        Log.i("AppModule", " test : $test , test2 : $test2, test3: $test3")
        MainPresenter(get())
    }

    // Singleton
    single<DummyRepository> { DummyRepositoryImpl() }

    // ViewModel 사용
    viewModel { MainViewModel(androidApplication(), get()) }
}