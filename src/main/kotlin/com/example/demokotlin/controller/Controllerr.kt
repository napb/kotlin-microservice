package com.example.demokotlin.controller

import com.example.demokotlin.dto.SomeDto
import com.example.demokotlin.service.IServicee
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class Controllerr(
    @Qualifier("serviceC")
    private val service: IServicee
    ) {

    @GetMapping("{someGreeting}")
    fun greeting(
        @PathVariable(value = "someGreeting") someGreeting: String,): SomeDto {
        return service.greetings(someGreeting)
    }

}