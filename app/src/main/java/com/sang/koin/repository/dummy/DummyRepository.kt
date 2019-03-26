package com.sang.koin.repository.dummy


interface DummyRepository {
    fun get(): MutableList<DummyModel>
}

class DummyRepositoryImpl : DummyRepository {
    override fun get(): MutableList<DummyModel> {
        return arrayListOf(DummyModel("title1", "content1"),
                DummyModel("title2", "content2"),
                DummyModel("title3", "content3"))
    }
}

