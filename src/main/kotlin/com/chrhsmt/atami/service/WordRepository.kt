package com.chrhsmt.atami.service

import com.chrhsmt.atami.entity.Word
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.util.*

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "words", path = "words")
interface WordRepository : PagingAndSortingRepository<Word, Long> {

//    fun findAll(pageable: Pageable): Page<Word>
    fun save(word: Word): Word
//    fun findById(id: Long): Optional<Word>fun findByWord(word: String) : Word
    fun findByWord(word: String): Optional<Word>
}