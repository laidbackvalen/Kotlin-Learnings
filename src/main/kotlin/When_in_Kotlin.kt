package org.example

fun main() {

    print("Enter marks : ")
    val marks = readln().toInt()

    val grade: Char = when (marks) {  //works as switch or you can call it switch
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> 'C'
        in 45..70 -> 'D'
        else -> 'F'

    }
    println("Your grade is : $grade ")
}