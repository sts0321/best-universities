package com.example.bestuniversities.presenter.viewmodel

import androidx.lifecycle.ViewModel
import com.example.bestuniversities.data.ItemData
import com.example.bestuniversities.domain.AppRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UniversitiesVMImpl @Inject constructor(
    val appRepository: AppRepositoryImpl
) : ViewModel(), UniversitiesVM {
    override fun getUniversList(): ArrayList<ItemData> = appRepository.itemList()
}