package com.chrhsmt.atami.entity

import javax.persistence.*

@Entity
@Table(name = "words")
class Word (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "user_id", nullable = false)
    val userId: Long? = null,
    @Column(nullable = false)
    val word: String? = null ) : TimestampEntity() {
}