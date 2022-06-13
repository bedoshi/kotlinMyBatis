package com.example.demo.mapper

import com.example.demo.model.MemberDynamicSqlSupport
import com.example.demo.model.MemberModel
import org.apache.ibatis.annotations.*
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import org.mybatis.dynamic.sql.util.kotlin.SelectCompleter
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectList

@Mapper
interface MemberMapper {
    @SelectProvider(type = SqlProviderAdapter::class, method = "select")
    @ConstructorArgs(
        Arg(column = "id", javaType = Int::class, jdbcType = JdbcType.INTEGER, id = true),
        Arg(column = "blood", javaType = String::class, jdbcType = JdbcType.VARCHAR, id = true),
        Arg(column = "name", javaType = String::class, jdbcType = JdbcType.VARCHAR, id = true),
        Arg(column = "corp", javaType = String::class, jdbcType = JdbcType.VARCHAR, id = true)
    )
    fun selectMany(selectStatement: SelectStatementProvider): List<MemberModel>
}

fun MemberMapper.select(completer: SelectCompleter) =
    selectList(
        this::selectMany,
        MemberDynamicSqlSupport.columnList,
        MemberDynamicSqlSupport.member,
        completer
    )
