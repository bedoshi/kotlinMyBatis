package com.example.demo.controller

import com.example.demo.service.MemberService
import org.json.JSONArray
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController {

    @Autowired
    lateinit var service: MemberService

    @GetMapping("/member/all")
    fun allMember(): String {
        val data = service.selectAll()
        return JSONArray(data).toString()
    }
}