package com.chrhsmt.atami.service

import com.chrhsmt.atami.entity.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * TODO: Crudを制限したい
 */
@Repository
interface UserRepository : CrudRepository<User, Long>{

    fun findAll(pageable: Pageable): Page<User>
    fun save(user: User): User
}