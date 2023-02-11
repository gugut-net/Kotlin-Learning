package com.example.mykotlinlearning

/**
 * Extension function -> extend the function without having to inherit the class
 *
 */

class Circle (

    val radius: Double
) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

/**
 * For multiple codes
 */
fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

/**
 * Code efficient
 */
fun Circle.perimeterTest(): Double = 2 * Math.PI * radius

/**
 * Main function
 */
fun main() {

    val circle = Circle(3.5)

    println("Radius: ${circle.radius}")
    println("Area: ${circle.area()}")

    println("Area: ${circle.perimeter()}")
}