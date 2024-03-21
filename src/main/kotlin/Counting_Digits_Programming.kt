package org.example

fun main() {
    println("Enter a number to find the number of digits in it : ")
    var read = readln().toInt()
    countingDigit(read)

}

fun countingDigit(number: Int) {

    var count = 0
    var n = number

    while (n > 0) {
        val r = n % 10
//        println(n % 10)
        count++
        n = n / 10 //n/=10
//        println(n)

    }
    println("Number of digit found in your number is $count")
}