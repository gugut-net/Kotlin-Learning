package com.example.mykotlinlearning

/**
 * Higher Order function / Lambda function as a parameter or return type.
 */
fun main() {

    /**
     * Lambda function
     */
    val callFun = {
        println("Hey, I am Lambda function")
    }

    /**
     * Higher Order function
     */
    println(callFun)
    println(callFun())

    val addFun = { a: Int, b: Int ->
        a+b
    }
    println(addFun(2, 3))

}