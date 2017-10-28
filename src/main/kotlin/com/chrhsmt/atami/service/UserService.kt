package com.chrhsmt.atami.service

import com.chrhsmt.atami.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service


@Service
class UserService @Autowired constructor(
        private val userRepository: UserRepository) {

    fun findUser(pageable: Pageable): Page<User> {
        return userRepository.findAll(pageable)
    }

    fun saveUser(user: User): User {
        return userRepository.save(user)
    }
}