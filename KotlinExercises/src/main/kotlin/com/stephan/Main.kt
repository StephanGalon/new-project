package com.stephan

fun main(args: Array<String>) {
// com.stephan.first()
//    com.stephan.chess()
//    com.stephan.integerTest()
//    com.stephan.nullabel()
//    println(com.stephan.findDuplicates(intArrayOf(1,2,3,4,5,1)))
//    println(com.stephan.findDuplicates2(intArrayOf(1,2,3,4,5,1)))
//    println(com.stephan.makePassword(12,4))
//    com.stephan.continues()
//    val v1 = Car("Ford","Mustang", 1969)
//    val v2 = Car("Mercedes", "E",2005)
//    v1.drive()
//    v2.maxSpeed(300)
//    var a = "A"
//    var b = "B"
//    a = b.also { b = a }
//    println(a)
//    println(b)
//    printi()
//    breakAndContinue()
//    ranges()
//    forEach()
//    switch(42)
//    modulo(5, 4, 50)
//    println(fibonacci(2))
//    println(factorial(5)) //Recursive
//    println(facul(n = 5)) //loop and specify parameters explicitly
    println(abs(-6));println(abs(6))
}

fun first(){
    val myArray = arrayOf(13,46,54,654,651,635,496,416,416,4,96874,961,6126,9496,16,49)
    var max = 0
    val bigest = myArray.max()
    println(bigest)
    for (value in myArray)
        if(value > max)
            max = value
    println(max)
    //Fakultät: 5! = 5*4*3*2
    var n = 5
    for (i in 1 until n)
        n *= i
    println(n)
    val list = mutableListOf("A", null, null, "B", "C", null, "D", null)
    list.replaceAll { it ?: "" }
    println(list)
}
fun chess(){
    val row1 = arrayOf(2,3,4,5,6,4,3,2)
    val row2 = arrayOf(1,1,1,1,1,1,1,1)
    val row3 = arrayOf(0,0,0,0,0,0,0,0)
    val row4 = arrayOf(0,0,0,0,0,0,0,0)
    val row5 = arrayOf(0,0,0,0,0,0,0,0)
    val row6 = arrayOf(0,0,0,0,0,0,0,0)
    val row7 = arrayOf(1,1,1,1,1,1,1,1)
    val row8 = arrayOf(2,3,4,5,6,4,3,2)
    val playingfield = arrayOf(row1,row2,row3,row4,row5,row6,row7,row8)
    playingfield[1][3] = 0
    playingfield[3][3] = 1
    for (column in playingfield) {
        for (row in column) {
            print(row)
            print(",")
        }
        println()
    }
}
fun integerTest(){
    var i = 0
    while (i < i + 1){
        i++
    }
    println(i)
    println(i + 1)
}
fun nullabel(){
    val myString: String? = null
    println(myString?.length) //? means if(myString != null)
    println(myString!!.length) // !! means acceptance not null >>>>!never use!<<<<<
}
fun findDuplicates(x: IntArray) = x.size == x.distinct().size
fun findDuplicates2(x: IntArray) = x.size == x.toSet().size
fun makePassword(x: Int, y: Int = 0) :String{
    val lower: String = "abcdefghijklmnopqrstuvwxyz"
    val letter: String = lower + lower.uppercase()
    val other ="1234567890!§$%&/()=?,;.:-_#+*"
    val lst = mutableListOf<Char>()
    for (i in 0 until x)
        lst += letter.random()
    for (i in 0 until y)
        lst += other.random()
    return lst.shuffled().joinToString("")
}
fun continues(){
    for (nums in 0..10) {
        if (nums == 5) {
            continue
        }
        println(nums)
    }
}
class Car(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("Wrooom!")
    }
    fun maxSpeed(x: Int){
        println("Max speed is: $x")
    }
}
fun printi(){
     val myInt = 42
    println("MyInt = $myInt and that's good!") // $ masket with \ than printout: MyInt = $myInt...
    }
fun breakAndContinue(){
    val myString = "hello darkness"
    var i = 0
    stephan@while(i<5){
        for (char in myString){

            if (char == 'l')
                continue

            print(char)
            if (char == ' ')
                break@stephan //marked break: closes the loop called stephan
        }
        i++
    }

}
fun ranges(){
    for(i in 0..20 step 2){
        print(i)
        print(" ")
    }
    println()
    for (i in 42 downTo 19 step 3){
        print(i)
        print(" ")
    }
    println()
}
fun forEach(){
    val myAr = arrayOf(42,42,42,42,424,24,24,24,242,424,20)
    myAr.forEach { print(it); print(" ") }
    println()
    for((i, num) in myAr.withIndex()) { // gives the index and the number
        print("index = $i ")
        println("number = $num")
    }
}
fun switch(x: Int){

    when(x){
        0, 1, 2, 3, 4, 5 -> println("x is between 0 and 5")
        in 6..41 -> println("x is between 6 and 43")
        42 -> println("x is 42")
        else -> {
            println("x is unknown ")
            println("really unknown")
        }
    }
    val y = when(x){
        42 -> 42
        else -> 50
    }
    println(y)
}
fun modulo(row: Int, from: Int, until: Int){
    for (i in from..until)
        if (i%row == 0)
            println(i)
}
fun fibonacci(n: Int) : Int{ //Recursion
    if (n == 1){
        return 1
    }
    if(n == 0){
        return 0
    }
    val pre1 = fibonacci(n - 1)
    val pre2 = fibonacci(n - 2)
    return pre1 + pre2
}
fun factorial(n: Long /* = 15* <--Default*/) : Long{ //Recursion    Default parameter every from right beginning
    return if(n <= 1) 1
    else n * factorial(n -1)
}
fun facul(n: Long): Long {
   var result: Long = 1
   for (i in 1..n){
       result *= i
   }

    return result
}
fun abs(x: Int) = if(x>=0) x else x * (-1)
