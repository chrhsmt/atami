package com.chrhsmt.atami.service

import com.chrhsmt.atami.entity.User
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
interface UserRepository : PagingAndSortingRepository<User, Long> {

//    fun findAll(pageable: Pageable): Page<User>
    fun save(user: User): User

    @RestResource(exported = false)
    override fun deleteById(id: Long)
    @RestResource(exported = false)
    override fun delete(entity: User)
    @RestResource(exported = false)
    override fun deleteAll(entities: Iterable<User>)
    @RestResource(exported = false)
    override fun deleteAll()
}