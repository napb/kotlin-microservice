package com.example.demokotlin.service

import com.example.demokotlin.dto.SomeDto
import org.springframework.stereotype.Service

@Service
class ServiceA: IServicee {
    override fun greetings(greet: String): SomeDto {
        return SomeDto(1, "$greet Service A")
    }
}