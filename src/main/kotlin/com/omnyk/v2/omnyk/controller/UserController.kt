package com.omnyk.v2.omnyk.controller

import com.omnyk.v2.omnyk.model.OmnykUser
import com.omnyk.v2.omnyk.userservice.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/getAll")
    fun getUser(): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(userService.findAll())
        } catch (e: Exception) {
            ResponseEntity.badRequest().body(e.localizedMessage)
        }
    }

    @PostMapping("/insert")
    fun insertUser(@RequestBody user: OmnykUser): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(userService.insert(user))
        } catch (e: Exception) {
            ResponseEntity.badRequest().body(e.localizedMessage)
        }
    }

    @GetMapping
    fun helloUser(): String {
        return "Hello user . I love you babes"
    }

    @DeleteMapping("/delete")
    fun deleteAllUsers(): String {
        return try {
            userService.deleteAll()
            "All users deleted"
        } catch (e: Exception) {
            "Not able to delete due to ${e.localizedMessage}"
        }
    }
}