package com.carlos.mung.controller

import com.carlos.mung.domain.User
import com.carlos.mung.service.UserService
import org.springframework.web.bind.annotation.*

// @RestController 어노테이션으로 컨트롤러 클래스임을 명시함
@RestController
@RequestMapping("/api/v1/users")
class UserController(private val userService: UserService) {
    // @GetMapping 어노테이션으로 get 요청을 처리함
    @GetMapping
    fun getAllUsers(): List<User> = userService.findAll()

    // @PostMapping 어노테이션으로 post 요청을 처리함
    @PostMapping
    fun createUser(@RequestBody user: User): User = userService.save(user)
}