package com.canteko.helloworldkotlin

class D(var var1: String?, var var2: String)

fun main (args: Array<String>? = null) {
    // Utilizamos ? antes de la variable para comprobar nulabilidad
    var objectD = D(null, "Hola")
    println("Count var1: " + objectD.var1?.count())

    objectD.var1 = "Hola"
    println("Count var1: " + objectD.var1?.count())

    // Usamos el poreador elvis
    objectD.var1 = null
    println("Count var1 elvis: " + (objectD.var1?.count() ?: 0))

    // Obligamos a ejecutar la funcion aunque var1 sea nulo, NO UTILIZAR
    // println("Count var1 elvis: " + objectD.var1!!.count())

    // Probamos let con operador elvis y funcionalidad en el "else"
    var objectD2: D? = null
    objectD2?.var1?.let {
        println("Ejecuto LET")
    } ?: run {
        println("NO Ejecuto LET")
    }

    objectD2 = D("HOLA", "HOLA")
    objectD2?.var1?.let {
        println("Ejecuto LET 2")
    } ?: run {
        println("NO Ejecuto LET 2")
    }
}