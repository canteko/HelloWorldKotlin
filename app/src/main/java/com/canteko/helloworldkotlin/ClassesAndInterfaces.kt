package com.canteko.helloworldkotlin

open class A(var var1: String, var var2: Int){

    init {
        println("Init invocado")
    }

    constructor(var1: String) : this(var1, 0)
}

class B(var1: String, var2: Int, var var3: String) : A(var1, var2), MyInterface {
    override fun foo() {
        println("Foo")
    }

    fun concat(a: String, b: String): String {
        return a + b;
    }

    fun sum(i: Int): Int{
        return this.var2 + i
    }
}

interface MyInterface {
    fun foo()
}

fun main(args: Array<String>? = null) {
    var objectA = B("Hola", 1, "Var3")
    println(objectA.var3)
    objectA.foo()
    println(objectA.concat("Hola", "Dew"))
    println(objectA.sum(5))

}