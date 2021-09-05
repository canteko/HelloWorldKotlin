package com.canteko.helloworldkotlin

open class E(var var1: String)
class F(var1: String, var var2: String) : E(var1)
class G(var1: String, var var3: String) : E(var1)

fun main (args: Array<String>? = null) {
    var objectF: Any = F("Hola mundo", "Test")

    // Casting a otro objeto con is
    if(objectF is E) {
        println(objectF.var1)
    }

    if(objectF is F) {
        println(objectF.var2)
    }

    if(objectF !is G) {
        println((objectF as F).var2)
    }


}