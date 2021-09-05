package com.canteko.helloworldkotlin

fun main (args: Array<String>? = null) {
    val list = listOf("Test1", "Test2")
    // Una lista mutable se puede declarar como val porque, como en java,
    // lo que se guarda es la referencia al objeto y no el objeto en si
    val mutableList = mutableListOf("Test1", "Test2")

    // Las listas no pueden cambiar, mutablesList si
    // list.add("Test3");
    mutableList.add("Test3");

    println("Antes de añadir")

    mutableList.map {
        println(it)
    }

    mutableList.add("Test4")
    println("Tras añadir")
    mutableList.map {
        println(it)
    }
}