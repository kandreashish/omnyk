package com.omnyk.v2.omnyk.model

import com.fasterxml.jackson.annotation.JsonFormat
import org.apache.http.HttpStatus
import java.time.LocalDateTime

internal class ApiError private constructor() {
    private var status: HttpStatus? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private val timestamp: LocalDateTime = LocalDateTime.now()
    private var message: String? = null
    private var debugMessage: String? = null
    private val subErrors: List<ApiSubError>? = null

    constructor(status: HttpStatus?) : this() {
        this.status = status
    }

    constructor(status: HttpStatus?, ex: Throwable) : this() {
        this.status = status
        message = "Unexpected error"
        debugMessage = ex.localizedMessage
    }

    constructor(status: HttpStatus?, message: String?, ex: Throwable) : this() {
        this.status = status
        this.message = message
        debugMessage = ex.localizedMessage
    }
}