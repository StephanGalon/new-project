package com.stephan

import kotlin.math.sqrt

fun main(){
//    takeAndDrop()
//    takeifAndTakeUnless() //filter is better
//    partition()
//    remove()
//    groupBy()
//    reduceFoldScan()
    forEach2()
}
fun takeAndDrop(){
    val lst1 = List(20){ it }
    val lst2 = lst1.take(5)
    val lst3 = lst1.drop(5)
    val lst4 = lst1.takeLast(5)
    val lst5 = lst1.dropLast(5)
    println(lst1)
    println(lst2)
    println(lst3)
    println(lst4)
    println(lst5)
}
fun takeifAndTakeUnless(){  //filter is better
    val x = (0..10).random()
    val y = x.takeIf { it % 2 == 0 }
    println("x = $x\ty = $y")
}
fun partition(){
    val lst = listOf(-3,-2,-1,0,1,2,3)
    val (even, odd) = lst.partition { it % 2 == 0 }
    println(even)
    println(odd)
}
fun remove(){                       //needs mutable
    val lst = List(20){ it }.toMutableList()
    lst.remove(4)           //delete index 4 --> Number 5
    val itm = lst.removeAt(5) //delete index 5 and number take it in itm
    println(lst)
    println(itm)
    lst.removeIf { it % 2 == 0 }    //delete all even numbers
    println(lst)
    lst.removeAll { it % 3 == 0 }   //delete all /3 divisible
    println(lst)
}
fun groupBy(){
    val lst = List(20){ it * it }
    println(lst)
    val groups = lst.groupBy { if(it % 2 == 0) "even" else "odd" }
    println(groups)
}
fun reduceFoldScan(){
    val lst = listOf(1,4,7,13,2,19,8)
    val sum = lst.reduce { a, b -> a + b } //sum
    //or
    val sum2 = lst.sum()
    println("sum = $sum sum2 = $sum2")
    val max = lst.reduce { a, b -> if(a > b) a else b }     //find the biggest
    println(max)
    val concat = lst.fold(""){ a, b -> a + b.toString() } //all to one String
    println(concat)
    var intermediatResults = lst.scan("") { a, b -> a + b.toString()}
    println(intermediatResults)
    val intemediateReduce = lst.runningReduce { a, b -> a + b }
    println(intemediateReduce)
    val lst2 =  listOf("a","b","c","lava")
    intermediatResults = lst2.scan("") {a, b -> a + b }
    println(intermediatResults)
    val sumQuat = lst.sumOf { (it * it).toDouble() }
    println(sumQuat)

    }
fun forEach2(){
    val lst = listOf(1,4,6,8,2,13,7,19,1,25,81)
    lst.forEach {
        val x = sqrt(it.toDouble())
        val output = "%10.5f"
        println(output.format(x))
    }
}
