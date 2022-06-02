package com.omnyk.v2.omnyk.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "users")
data class OmnykUser(
    @Id
    var userId: Long, val name: String
) {


}

