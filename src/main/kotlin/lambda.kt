package org.example

fun main() {
    val myVar = {
        println("hi i am lambda")
        println("Number : ${23+23}")
    }

    myVar()

    val rossi = {
        println("Name : Valentino Rossi")
    }

    rossi()

    val square = { x:Int-> println(x*x) }

    square(10)
}