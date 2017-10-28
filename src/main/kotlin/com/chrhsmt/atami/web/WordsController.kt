package com.chrhsmt.atami.web

import com.chrhsmt.atami.entity.Word
import com.chrhsmt.atami.service.WordRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/words")
class WordsController {

    @Autowired
    private val wordRepository: WordRepository? = null

    @PostMapping("/index")
    fun save(@RequestParam(name = "words") words: String, @RequestHeader(name = "Authorization") userId: Long) : Map<String, Int> {

        var count = 0
        words.split(Regex("\n")).forEachIndexed { index, word ->
            if (word != null && word.length > 0) {
                // TODO: findOrCreate
                // TODO: user_idチェック
                wordRepository!!.save(Word(word = word, userId = userId))
                count = index
            }
        }
        val map = mapOf<String, Int>("count" to (count + 1))
        return map
    }

    @GetMapping("/all")
    fun count(): Iterable<Word> {
        // TODO: user_idで
        return wordRepository!!.findAll(Pageable.unpaged())
    }
}