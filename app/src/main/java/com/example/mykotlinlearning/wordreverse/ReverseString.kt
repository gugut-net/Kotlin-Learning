package com.example.mykotlinlearning.wordreverse

import java.util.Scanner

/**
 * Reverse a string
 */
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a string: ")
    val string = reader.nextLine()
    val reversedString = string.reversed()
    println("The reversed string is: $reversedString")
}