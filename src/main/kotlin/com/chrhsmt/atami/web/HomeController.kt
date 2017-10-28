package com.chrhsmt.atami.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @RequestMapping("/")
    fun home(): String {
        return "Hello universe ??!"
    }

//    @RequestMapping("/friends")
//    fun all(): FriendsResponse {
//        return FriendsResponse(Friend.findAll())
//    }
//
//    @RequestMapping("/friends/{id}")
//    fun show(@PathVariable id: Int): FriendResponse {
//        return FriendResponse(Friend.findById(id))
//    }
}