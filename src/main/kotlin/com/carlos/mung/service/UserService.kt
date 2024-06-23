package com.carlos.mung.service

import com.carlos.mung.domain.User
import com.carlos.mung.repository.UserRepository
import org.springframework.stereotype.Service

// @Service 어노테이션으로 서비스 클래스임을 명시함
@Service
class UserService(private val userRepository: UserRepository) {
    fun findAll(): List<User> = userRepository.findAll()

    fun save(user: User): User = userRepository.save(user)
}