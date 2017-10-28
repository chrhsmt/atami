package com.chrhsmt.atami.entity

import java.sql.Timestamp
import java.util.*
import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.persistence.PreUpdate
import javax.persistence.PrePersist

@MappedSuperclass
abstract class TimestampEntity {

    @Column(updatable=true)
    var updatedAt: Timestamp? = null

    @Column(updatable = false)
    var createdAt: Timestamp? = null

    @PrePersist
    fun prePersist() {
        val ts = Timestamp(Date().getTime())
        this.createdAt = ts
        this.updatedAt = ts
    }

    @PreUpdate
    fun preUpdate() {
        this.updatedAt = Timestamp(Date().getTime())
    }
}