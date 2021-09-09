package com.canteko.helloworldkotlin

class H(var var1: Int, var var2: Int, private var var3: Int) {
    fun sum(): Int {
        return var1 + var2 + var3
    }
}

fun H.multiply(): Int {
    return this.var1 * this.var2
}

fun Int.isPair(): Boolean {
    return this % 2 == 0
}

fun Int.isPositive(): Boolean {
    return this >= 0
}

fun String.upperCaseFirstLetter(): String {
    return if(this.count() > 0) this.substring(0, 1).toUpperCase().plus(this.substring(1)) else ""
}

fun main (args: Array<String>? = null) {
    var objectH = H(1, 2, 3)
    println(objectH.sum())
    println(objectH.multiply())

    var number = 5
    var number2 = 6
    var number3 = -6
    println(number.isPair())
    println(number2.isPair())
    println(number2.isPositive())
    println(number3.isPositive())

    var sentence = "asdmiiirejrgerg"
    println(sentence.upperCaseFirstLetter())
    println("perfecto".upperCaseFirstLetter())
}