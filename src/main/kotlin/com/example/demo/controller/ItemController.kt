package com.example.demo.controller

import com.example.demo.service.ItemService
import org.json.JSONArray
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController {
    @Autowired
    lateinit var service: ItemService

    @GetMapping("/")
    fun index(): String {
        val modelList = service.find()
        val jsonArray = JSONArray(modelList)

        return jsonArray.toString()
    }
}