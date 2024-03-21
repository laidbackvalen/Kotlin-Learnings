package org.example

//class Human(var name: String, var age: Int, var email: String, var phone: String = "") {
class Human() {

    var name: String = ""
    var age: String = ""
    var email: String = ""
    var phone: String = ""

    constructor(nameaa: String, ageaa: String, emailaa: String, phoneaa: String) : this() {
        this.name = nameaa
        this.age = ageaa
        this.email = emailaa
        this.phone = phoneaa
    }


    fun salary(name: String, salary: String) {
        println("the salary of $name is : $salary")
    }

    fun salary(name: String, salary: String, email: String) {
        println("the salary of $name is : $salary and his email id is : $email")
    }

    fun details(){
        println("THE NAME IS : $name")
        println("THE AGE IS : $age")
        println("THE EMAIL IS : $email")
        println("THE PHONE NUMBER IS : $phone")
    }

}

fun main(args: Array<String>) {

    val valen = Human("valen", "18", "valen.patel1@gmail.com", "751777")  //initialising properties of class using constructor
    // valen.salary(valen.name, "10000") //function
//    valen.salary(valen.name, "10000", valen.email) //function

    println(valen.name)

//    val women = Human("tine", 10, "tinepatel@gmail.com", "9359867569")


    print("Enter Name : ")
    var name = readln()
    print("Enter Age : ")
    val age = readln()
    print("Enter Email : ")
    val email = readln()
    print("Enter Phone : ")
    var phoneNO = readln()

    var napunsak:Human = Human(name, age, email, phoneNO) as Human
    println()
//    println("name : "+napunsak.name)
//    println("age : "+napunsak.age)
//    println("email : "+napunsak.email)
//    println("phone : "+napunsak.phone)

    println(napunsak.details())

    val b =  Human("a", "b", "c", "d")

//    men.name = "valen"
//    men.phone = "7517770046"
//    men.age = 27
//    men.email = "valen.patel1@gmail.com"
//
//    val women = Human()
//
//    women.name = "Tainsa"
//    women.phone = "8605886969"
//    women.age = 18
//    women.email = "tine.patel1@gmail.com"
//
//
//
//    println(men.name)
//    println(women.name)
//
//    women.salary(women.name,"30,000")
//    men.salary(men.name,"10,000")
}
