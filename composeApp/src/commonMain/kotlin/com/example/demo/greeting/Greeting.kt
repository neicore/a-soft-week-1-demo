package com.example.demo.greeting

import com.example.demo.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Mambo, ${platform.name}!"
    }
}