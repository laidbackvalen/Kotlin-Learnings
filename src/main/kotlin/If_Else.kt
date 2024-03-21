package org.example


fun main() {

    print("Enter Number Between 0 to 10 : ")
    var read = readln().toInt()  //reading input as an Integer

    guessingGame(read)

    println()

//    if (read == 4) {
//        println("you gussed it right")
//    } else {
//        println("wrong assumption")
//    }




    println("Enter number 1 : ")
    var num1 = readln().toInt()
    println("Enter number 2 : ")
    var num2 = readln().toInt()

    val a = if(num1>num2)     //passing function to a variable
        println("Number 1 is greater than number 2")
    else
        println("Number 2 is greater than number 1")

}


fun guessingGame(i: Int) {
    var count = 1
    if (i == 7) {
        println("you guessed it right in your $count attempt")
    } else {
        ++count
        for (num in 1..4) {

            print("your ${num + 1} Attempt : ")
            var read1 = readln().toInt()

            if (read1 == 7) {
                println("you have gussed it in : $count attempts")
                break
            } else if (count == 5) {
                println("your 5 attemps are over!")
            } else {
                count++
            }
        }
    }


}
