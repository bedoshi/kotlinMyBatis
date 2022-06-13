package com.example.demo.model

import org.mybatis.dynamic.sql.SqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column
import java.sql.JDBCType

object MemberDynamicSqlSupport {

    val member = Member()
    val id = member.id
    val blood = member.blood
    val name = member.name
    val corp = member.corp

    val columnList = listOf(id, blood, name, corp)

    class Member: SqlTable("member") {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)
        val blood = column<String>(name = "blood", jdbcType = JDBCType.VARCHAR)
        val name = column<String>(name = "name", jdbcType = JDBCType.VARCHAR)
        val corp = column<String>(name = "corp", jdbcType = JDBCType.VARCHAR)
    }

}