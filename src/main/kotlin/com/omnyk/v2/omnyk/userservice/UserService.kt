package com.omnyk.v2.omnyk.userservice


import com.omnyk.v2.omnyk.model.OmnykUser
import org.springframework.data.mongodb.repository.MongoRepository


interface UserService : MongoRepository<OmnykUser, String> {

}