package com.omnyk.v2.omnyk.model

internal abstract class ApiSubError


internal data class ApiValidationError(private val obj: String, private val message: String) : ApiSubError() {
    private val field: String? = null
    private val rejectedValue: Any? = null
}