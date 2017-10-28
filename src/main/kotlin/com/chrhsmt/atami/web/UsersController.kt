package com.chrhsmt.atami.web

import com.chrhsmt.atami.entity.User
import com.chrhsmt.atami.service.UserRepository
import com.chrhsmt.atami.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UsersController {

    @Autowired
    private val userService: UserService? = null
    @Autowired
    private val userRepository: UserRepository? = null

    @GetMapping("/users")
    @ResponseBody
    fun getUsers(): Iterable<User> {
        return userRepository!!.findAll(Pageable.unpaged())
//        userService!!.findUser()
    }
}