package org.example

//Callback functions, also known as callbacks, are functions that are passed as arguments to other functions.
// These functions are typically used to execute code asynchronously or to handle events in response to certain conditions being met.


fun sumTwo(num1: Int, num2: Int, callBack: () -> Unit) {
    println("hello!")
    println("the Sum is : ${num1 + num2}")
    callBack()
}

fun main() {
    val callBackFunction = {
        println("Sum completed")
    }
    sumTwo(12, 12, callBackFunction)   //the 3rd argument is a function

    println("-------------------------------------------------------------------------")

    sumTwo(11, 11) {  //third parameter as a lambda
        println("Waah kya cheez hai! LAMBDA")   //this is another way to call a lambda
    }

    val multiply = { a: Int, b: Int, c: Int -> println(a * b * c) }

    sumTwo(11, 11) { multiply(2, 2, 2) }

    println("------------------------------------------------------------------------")

//    fun callsBac() {
//        println("heyyyyyyyyyyyyyyyyyyyyy")
//    }
//
//    fun cube(numOne: Int, numTwo: Int, callBac: ()->Unit) {
//        callsBac()
//    }
//
//    cube(1,2) { callsBac() }
}


