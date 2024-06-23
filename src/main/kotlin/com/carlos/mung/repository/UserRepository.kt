package com.carlos.mung.repository

import com.carlos.mung.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

// @Repository 어노테이션으로 jpa 레파지토리로 설정함
@Repository
interface UserRepository: JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
}