package org.example

fun main() {
    //program to find multiplication table
    print("Enter the Number to find the multiplication table : ")
    var readFromUser = readln().toInt()

    for(i in 1..10){
        println("$readFromUser X $i = ${readFromUser*i}")
    }
//    for(i in 1..100){
//        println(i)
//    }

    println()

    for(i in 10 downTo 1 step 2){  //Reverse //Step skips the digit by 2
        println(i)
    }



}