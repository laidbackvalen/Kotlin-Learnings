package org.example

import java.util.ArrayList as SubList    //arraylist ka naam sublist kr diya

fun main() {
    var arraylist : ArrayList<String>  = SubList<String>()
    arraylist.add("a")
    arraylist.add("b")
    arraylist.add("c")
    arraylist.add("e")

    println(arraylist)
    println(arraylist::class.java.name)

    for(i in arraylist){
        println(i)
    }
}