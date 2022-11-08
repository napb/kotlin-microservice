package com.example.demokotlin.service

import com.example.demokotlin.dto.SomeDto
import org.springframework.stereotype.Service

@Service
class ServiceB: AbstractService() {
    override fun greetings(greet: String): SomeDto {
        return SomeDto(2, "$greet Service B")
    }
}