package org.example

class Employee() {  //primary constructor
    var age = ""
    var id = ""
    var name = ""
    var salary = ""

    constructor(e_ID: String, e_NAME: String) : this() { //secondary constructors
        this.id = e_ID
        this.name = e_NAME
    }

    constructor(e_AGE: String, e_ID: String, e_NAME: String, e_SALARY: String) : this() { //Another Secondary Constructor
        this.age = e_AGE
        this.id = e_ID
        this.name = e_NAME
        this.salary = e_SALARY
    }

}

fun main() {
    val employee = Employee("111222333","Suresh")
    println("Employee 1 (ID) : "+employee.id)
    println("Employee 1 (NAME) : "+employee.name)

    println("--------------------------------------------------")

    val employee2 = Employee("47", "1205886969", "Paresh", "33,600")
    employee2.name = "valen"
    println("Employee 2 (AGE) : "+employee2.age)
    println("Employee 2 (SALARY) : "+employee2.salary)
}