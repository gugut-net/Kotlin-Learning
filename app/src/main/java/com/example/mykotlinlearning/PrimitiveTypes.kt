package com.example.mykotlinlearning

fun main() {

    /**
     * Assign values
     */
    val intTestValue: Int = 23
    val doubleTestValue: Double = 23.23
    val floatTestValue: Float = 23.23f
    val stringTestValue: String = " -23 = 2.2.3"

    /**
     * Null safety
     */
    val intTestValueNull: Int? = null
    val doubleTestValueNull: Double? = null
    val floatTestValueNull: Float? = null
    val stringTestValueNull: String? = null

    var intTestValue1 = 23
    var doubleTestValue1 = 23.23
    var floatTestValue1 = 23.23f
    var stringTestValue1 = ":) -324 = 2.2.3"

    val listAnother = listOf<String>()
    val listAnother1 = listOf("Malik", "Faisel")
    val listAnother2 = listOf<String>()

    /**
     * Convert values
     */
    intTestValue1 = (23.24).toInt()
    floatTestValue1 = intTestValue1.toFloat()
    doubleTestValue1 = floatTestValue1.toDouble()
    stringTestValue1 = doubleTestValue1.toString()

    /**
     * Null safety
     * ?. -> is safe call for the value
     * !! -> is forced  call for the value (not recommended until sure of it)
     * ?: -> is optional value reference / default value in case of null
     */
    //intTestValue1 = floatTestValueNull?.toInt() ?: 2 // if (notNull) actual value - also default value
    //if (intTestValueNull != null)
    intTestValue1 = intTestValueNull!!.toInt()
    floatTestValue1 = intTestValueNull!!.toFloat()
    doubleTestValue1 = floatTestValueNull?.toDouble() ?: 2.0
    stringTestValue1 = doubleTestValueNull.toString()


}