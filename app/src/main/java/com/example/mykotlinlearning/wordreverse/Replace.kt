package com.example.mykotlinlearning.wordreverse

import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a string: ")
    val string = reader.nextLine()
    val map = HashMap<String, String>()
    map["test"] = "Laptop"
    map["okay"] = "Gone"
    val replacedString = replaceAnnotations(string, map)
    println("The replaced string is: $replacedString")
}

fun replaceAnnotations(string: String, map: HashMap<String, String>): String {
    var replacedString = string
    for (key in map.keys) {
        replacedString = replacedString.replace("@$key@", map[key]!!)
    }
    return replacedString
}