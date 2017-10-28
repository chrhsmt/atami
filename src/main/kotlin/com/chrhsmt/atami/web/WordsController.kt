package com.chrhsmt.atami.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class WordsController {

    @RequestMapping("/words", method = arrayOf(RequestMethod.POST))
    fun save() {

    }
}