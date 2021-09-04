package com.canteko.helloworldkotlin

class C {
    var variable: String
    val value: String
    var number: Int
        set(value) {
            if(value >= 0) field = value else field = 0
        }
    var isEmpty: Boolean
        get() = variable.count() == 0

    constructor(variable: String, value: String, number: Int) {
        this.variable = variable
        this.value = value
        this.number = number
        this.isEmpty = false
    }

    override fun toString(): String {
        return "C(variable='$variable', value='$value', number=$number, isEmpty=$isEmpty)"
    }
}

fun main (args: Array<String>? = null) {
    var objectC = C("String", "Inmutable", 69)
    println(objectC)

    objectC.variable = "String3"
    println(objectC)

    objectC.number = -10
    println(objectC)

    var text = "String como Array"
    for (letter in text) {
        println(letter)
    }
    println("Accedemos al indice 3: ${text[3]}")
}
