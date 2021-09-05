package com.canteko.helloworldkotlin

fun main (args: Array<String>? = null) {
    val list: List<Int?> = listOf(0, 1, 2, null, 3)
    println("IN")
    // in
    for (number in list) {
        number?.let{
            print(number.toString() + " ")
        } ?: print("Elemento nulo ")
    }

    println()
    println()
    println("IN con rango")
    // in rangos completo
    for (number in 0..10) {
        print(number % 10)
    }

    println()
    println()
    println("IN con rango untill")
    // in rangos parcial con untill
    for (number in 0 until 10) {
        print((number % 10).toString() + " ")
    }

    println()
    println()
    println("WHILE")
    var count = 10
    while (count > 0) {
        print(count.toString() + " ")
        count--
    }
}