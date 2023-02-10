package com.stephan

fun main(){
//    map()
//    flatmap()
    filter()
}
fun filter(){
    val lorem = "Lorem ipsum dolor sit amet, conseteretur sadipscing"
    val lst = lorem.split(" ")
    val longwords = lst.filter { it.length > 6}
    println(longwords)
    val lstTwo = listOf(1,"a", 2.9,'D',"Hello")
    val strings = lstTwo.filterIsInstance<String>()
    println(strings)
}
fun flatmap(){
    val lst = listOf(1,2,3)
    println(lst)
    val nested = lst.map { (1..it).toList() }
    println(nested)
    val flat = lst.flatMap { (1..it).toList()  }
    println(flat)
}
fun map(){
    val lst  = "Lorem ipsum".toList()
    println(lst)
    val lstUpper = upper(lst)
    println(lstUpper)
    val lstAsscii = asscii(lst)
    println(lstAsscii)
}
fun upper(lst: List<Char>): List<Char> {
    return lst.map { it.uppercaseChar() }
}
fun asscii(lst: List<Char>) : List<Int> {
    return lst.map { it.code }
}