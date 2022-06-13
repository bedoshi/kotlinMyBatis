package com.example.demo.mapper

import com.example.demo.model.ItemModel
import org.apache.ibatis.annotations.Mapper

@Mapper
interface ItemMapper {
    fun find(): List<ItemModel>
}