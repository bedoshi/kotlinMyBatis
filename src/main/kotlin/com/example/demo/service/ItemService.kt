package com.example.demo.service

import com.example.demo.mapper.ItemMapper
import com.example.demo.model.ItemModel
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ItemService(private val mapper: ItemMapper){
    fun find(): List<ItemModel> = mapper.find()
}