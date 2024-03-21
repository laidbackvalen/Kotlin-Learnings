package org.example

fun main(args : Array<String>){
    var array :Array<String> = arrayOf("a", "b", "c","d")

    //Kotlin provides a feature called "type inference"

    // Type inference is a feature in programming languages where the type of a variable is automatically determined by the compiler
    // or interpreter based on the context in which it is used. It allows programmers to write code without explicitly specifying
    // the data types of variables, making the code more concise and readable.

    var arrayAny = arrayOf<Any>("a", 1, "b",2)

    for(elements in array){
        println(elements)
    }

    println()

    for(element in arrayAny){
        println(element)
    }

    println("----------------------------------------------")
    println(arrayAny[1])
}