package com.chrhsmt.atami.entity

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        @Column(nullable = false)
        val name: String? = null ) : TimestampEntity() {
}