package org.example


fun sum(vararg number: Int) {
    for (values in number) {
        println(values)
    }
}

fun sumValues(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main() {
    sum(1, 2, 3, 4)

    val a = sumValues(1, 2, 3, 4)
    println("Sum Of Numbers is : $a")
}


