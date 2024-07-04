package com.example.bestuniversities.presenter.viewmodel

import com.example.bestuniversities.data.ItemData

interface UniversitiesVM {
    fun getUniversList(): ArrayList<ItemData>
}