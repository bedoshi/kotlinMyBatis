package com.example.demo.service

import com.example.demo.mapper.MemberMapper

import com.example.demo.model.MemberRecord
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.select
import com.example.demo.model.MemberDynamicSqlSupport.id
import com.example.demo.model.MemberDynamicSqlSupport.blood
import com.example.demo.model.MemberDynamicSqlSupport.name
import com.example.demo.model.MemberDynamicSqlSupport.corp
import com.example.demo.model.MemberDynamicSqlSupport.member

@Service
@Transactional
class MemberService(private val mapper: MemberMapper) {
    fun selectAll(): List<MemberRecord> {
        val selectStatement = select(id, blood, name, corp) {
            from(member)
            orderBy(id)
        }
        return mapper.selectMany(selectStatement)
    }

    fun searchMemberById(memberId: Int): List<MemberRecord> {
        val selectStatement = select(id, blood, name, corp) {
            from(member)
            where { id isEqualTo memberId }
        }

        return mapper.selectMany(selectStatement)
    }

}
