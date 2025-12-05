package com.example.demo

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Mambo, ${platform.name}!"
    }
}