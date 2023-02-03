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
    var a = "A"
    var b = "B"
    a = b.also { b = a }
    println(a)
    println(b)


}
fun first(){
    var myArray = arrayOf(13,46,54,654,651,635,496,416,416,4,96874,961,6126,9496,16,49)
    var max = 0
    var bigest = myArray.max()
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
    var row1 = arrayOf(2,3,4,5,6,4,3,2)
    var row2 = arrayOf(1,1,1,1,1,1,1,1)
    var row3 = arrayOf(0,0,0,0,0,0,0,0)
    var row4 = arrayOf(0,0,0,0,0,0,0,0)
    var row5 = arrayOf(0,0,0,0,0,0,0,0)
    var row6 = arrayOf(0,0,0,0,0,0,0,0)
    var row7 = arrayOf(1,1,1,1,1,1,1,1)
    var row8 = arrayOf(2,3,4,5,6,4,3,2)
    var playingfield = arrayOf(row1,row2,row3,row4,row5,row6,row7,row8)
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
    var myString: String? = null
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
        println("Max speed is: " + x)
    }
}


