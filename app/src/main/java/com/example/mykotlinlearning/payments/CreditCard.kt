package com.example.mykotlinlearning.payments

import java.util.Scanner

class CreditCard(val cardNumber: String, val expiryDate: String) {
    fun isValid(): Boolean {
        return hasValidCardNumber() && hasValidExpiryDate()
    }

    private fun hasValidCardNumber(): Boolean {
        return cardNumber.length == 16
    }

    private fun hasValidExpiryDate(): Boolean {
        return expiryDate.length == 5
    }
}

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a card number: ")
    val cardNumber = reader.nextLine()
    print("Enter the expiry date: ")
    val expiryDate = reader.nextLine()
    val card = CreditCard(cardNumber, expiryDate)
    if (card.isValid()) {
        println("The card is valid")
    } else {
        println("The card is invalid")
    }
}