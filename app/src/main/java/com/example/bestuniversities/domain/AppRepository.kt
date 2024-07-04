package com.example.bestuniversities.domain

import com.example.bestuniversities.data.ItemData

interface AppRepository {

    fun itemList():ArrayList<ItemData>
}