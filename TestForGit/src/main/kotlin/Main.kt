import java.lang.Math.abs
import java.sql.Array

fun main() {
//    println("Hello Git!")
//    println("How are you?")
//    println(sum(3, 4)); println(sum(4, 2)); println(sum (5,5)) //Question 1

//    println(absoluteDifference(44)); println(absoluteDifference(55)); println(absoluteDifference(51)) //Question 2

//    println(trueOrNot(30,10)); println(trueOrNot(20, 30)); println(trueOrNot(12,18)); println(trueOrNot(0,3)) //Question 3

//    println(whithin(180)) //Question 4

//    println(multiple(27)); println(multiple(35)); println(multiple(25)) //Question 5

//    println(temperatures(-2, 102)); println(temperatures(34, 102)); println(temperatures(112, -4))//Question 6

//    println(between(123,3)); println(between(12,100)); println(between(1230,200)); println(between(12,355)) //Question 7

//    println(onTwoOrThree(1,2,3)); println(onTwoOrThree(23,2,3)); println(onTwoOrThree(22,33,3))
//    println(onTwoOrThree(122,22,355)); println(onTwoOrThree(30,24,32))//Question 8

//    println(onOreTwo(12,3,7)); println(onOreTwo(22,3,7)); println(onOreTwo(22,33,7))
//    println(onOreTwo(22,33,45))//Question 9

//    println(nearestZero(50,50)); println(nearestZero(50,56)); println(nearestZero(77,50))
//    println(nearestZero(96,104)); println(nearestZero(-1,201))//Question 10

//    println(onlyTwoIn(12,90)); println(onlyTwoIn(42,48)); println(onlyTwoIn(44,56))
//    println(onlyTwoIn(50,53)); println(onlyTwoIn(48,50))//Question 11

//    println(oneValueIn(12, 13)); println(oneValueIn(20, 13)); println(oneValueIn(12, 30))
//    println(oneValueIn(22, 24)); println(oneValueIn(24, 55))//Question 12

//    println(nonNegativeValueSameLastDigit(123145, 12312)); println(nonNegativeValueSameLastDigit(1254, 1255))
//    println(nonNegativeValueSameLastDigit(12, 12312)); println(nonNegativeValueSameLastDigit(1000, 10))//Question 13

//    val x = intArrayOf(0,1,2,3,4,5)
//    println(numbersequenceInArrayFinder(x))//Question 14

//    countNumber5NextTo()//Question 15

//    val a = intArrayOf(1,2,3,4,5,3,7,5,3,4,9)
//    val b = intArrayOf(3,4,5,6,7,22,22,22)
//    val c = intArrayOf(1,2,2,2)
//    println(tripel(a)); println(tripel(b)); println(tripel(b))//Question 16

//    println(sumInRange(12,5)); println(sumInRange(12,35))//Question 17

//    println(fiveInOne(5,4)); println(fiveInOne(2,5)); println(fiveInOne(1,4)); println(fiveInOne(3,4))//Question 18

//    println(funny13(1079)); println(funny13(12)); println(funny13(25))//Question 19

//    println(threeOreSeven(3,5)); println(threeOreSeven(3,7)); println(threeOreSeven(5,7))
//    println(threeOreSeven(4,5))//Question 20

//    println(multi10under2(111)); println(multi10under2(77))//Question 21

//    println(oneFromToIn(12,4)); println(oneFromToIn(28,20)); println(oneFromToIn(4,9))
//    println(oneFromToIn(100,-8))//Question 22

//    println(twoAreOne(3, 4, 7)); println(twoAreOne(3, 4, 12))//Question 23

//    println(whoIsBigger(12, 33, 3)); println(whoIsBigger(12, 10, 3)); println(whoIsBigger(12, 33, 44))//Question 24

//    println(twoOrMore(1,2,3));println(twoOrMore(55,15,12));println(twoOrMore(12,145,122))//Question 25

//    println(lessThanTwenty( 123,22,120)); println(lessThanTwenty( 12,13,120)); println(lessThanTwenty( 123,22,400))//Question 26

//    println(twoThroughFive(123,1123)); println(twoThroughFive(50,5)); println(twoThroughFive(123,123))//Question 27

//    println(masterThree(30,3)); println(masterThree(12,48)); println(masterThree(56,26))
//    println(masterThree(84,71))//Question 28

//    println(sumOfThree(12,12,3)); println(sumOfThree(8,7,3))//Question 29

//    println(wildTherteen(13,23,12)); println(wildTherteen(44,13,12)); println(wildTherteen(17,23,13))
//    println(wildTherteen(15,23,12))//Question 30

//    println(betweenZero(13,120,180)); println(betweenZero(120,17,180)); println(betweenZero(13,120,17))
//    println(betweenZero(150,140,230)); println(betweenZero(15,12,11))//Question 31

//    println(notOverTherteen(13, 12)); println(notOverTherteen(8, 12)); println(notOverTherteen(43,12))
//    println(notOverTherteen(11, 15)); println(notOverTherteen( 12, 18)); println(notOverTherteen(15,18))//Question 32

//    println(smallMediumLarge(12,34,2));println(smallMediumLarge(10,5,0))//Question 33

//    println(equalFirstAndLast(intArrayOf(4))); println(equalFirstAndLast(intArrayOf(3,4,1,2,3)))
//    println(equalFirstAndLast(intArrayOf(2,3)))//Question 34

//    println(sameFirstAndLast(intArrayOf(2, 3, 4), intArrayOf(2, 3, 2, 3, 4)))
//    println(sameFirstAndLast(intArrayOf(2, 3, 4, 5), intArrayOf(2, 3, 2, 3, 4)))
//    println(sameFirstAndLast(intArrayOf(1, 2, 3, 4, 5), intArrayOf(2, 3, 2, 3, 4)))//Question35

//    println(arraySum(intArrayOf(1,2,3)))//Question 36

//    println(rotateArray(intArrayOf(1,2,3,4,5)).contentToString())//Question 37 and 38

//    println(twoToOne(intArrayOf(1,2,3,4,5),intArrayOf(1,2,3,4)).contentToString())//Question 39
//    println(twoToOne2(intArrayOf(1,2,3,4,5),intArrayOf(1,2,3,4)).contentToString())//Question 39

//    println(middleArray(intArrayOf(1,2,3,4,5),intArrayOf(10,20,30,40,50)).contentToString())//Question 39 corrected

//    println(firstAndLastTransfer(intArrayOf(1,2,3,4,5)).contentToString())//Question 40

//    println(fifteenOrTwenty(intArrayOf(1,3,15,6,5))); println(fifteenOrTwenty(intArrayOf(1,3,6,5,20)))
//    println(fifteenOrTwenty(intArrayOf(1,3,6,5)))//Question 41

    println(notFifteenOrTwenty(intArrayOf(1,3,15,6,5))); println(notFifteenOrTwenty(intArrayOf(1,3,6,5,20)))
    println(notFifteenOrTwenty(intArrayOf(1,3,6,5)))//Question 42
}
fun sum(x: Int, y: Int) :Int {
    val sum = x + y
    return if(x == y) sum * 3 else sum
}
fun absoluteDifference(n: Int) :Int{
    val absoluteDifference= abs(n - 51)
    return if (n>= 51) absoluteDifference * 3 else absoluteDifference
}
fun trueOrNot(x: Int, y: Int) :Boolean{
    return if (x + y == 30 || x == 30 || y == 30) true else false
}
fun whithin(x: Int) :Boolean{
    return if (x< 200 && x> 10) true else false
}
fun multiple(x: Int) :Boolean{
    return if(x % 7 == 0) true else if(x % 3 == 0) true else false
}
fun temperatures(x: Int, y: Int) :Boolean{
    return if ((x < 0 && y > 100)||(y < 0 && x > 100)) true else false
}
fun between(x: Int, y: Int) :Boolean{
    return if((x >= 100 && x <= 200)||(y >= 100 && y <= 200)) true else false
}
fun onTwoOrThree(x: Int, y: Int, z: Int) :Boolean{
    return if ((x >= 20 && x <= 50)||(y >= 20 && y <= 50)||(z >= 20 && z <= 50)) true else false
}
fun onOreTwo(x: Int, y: Int, z: Int) :Boolean{
    var a = 0
    if (x>=20 && x<= 50) a++
    if (y>=20 && y<= 50) a++
    if (z>=20 && z<= 50) a++
    return if (a < 3 && a > 0) true else false
}
fun nearestZero(x: Int, y: Int) :Int{
   return if (abs(100 - x) == abs(100 - y))  0 else if(abs(100 - x) > abs(100 - y)) return y else return x
}
fun onlyTwoIn(x: Int, y: Int) :Boolean{
   return if((x >= 40 && x <=50 && y >= 40 && y <= 50) || (x >= 50 && x <=60 && y >= 50 && y <= 60)) true else false
}
fun oneValueIn(x: Int, y: Int) :Int{
    return if((x >= 20 && x <= 30 && y >= 20 && y <= 30)) if (x >= y) x else y
        else if (x >= 20 && x <= 30) x
        else if (y >= 20 && y <= 30) y
    else 0
}
fun nonNegativeValueSameLastDigit(x: Int, y: Int) :Boolean{
    return if(x % 10 == y % 10) true else false
}
fun numbersequenceInArrayFinder(x: IntArray) :Boolean{
    val arr123 = arrayOf(1, 2, 3)
    val xlength= x.size-1
    var i = 0
    while(i<=xlength){
        if (arr123.get(0) == x.get(i) && arr123.get(1) == x.get(i+1) && arr123.get(2) == x.get(i+2))
        return true
        i++
    }
    return false
}
fun countNumber5NextTo(){
    val x = arrayOf(
        arrayOf(5, 5, 2, 3, 5, 5),
        arrayOf(2, 3, 5, 6, 7, 8, 9),
        arrayOf(5, 4, 3, 2, 1, 5, 5))
    for (ar in x) {
        var i = 0
        var counn = 0
        while (i < ar.size - 1) {
            if (ar.get(i) == 5 && (ar.get(i + 1) == 5 || ar.get(i + 1) == 6))
            counn++
            i++
        }
        println(counn)
    }
}
fun tripel(x: IntArray) :Boolean{
    for (i in 0 until x.size - 2){

        if (x.get(i) == x.get(i + 1) && x.get(i) == x.get(i + 2))
        return true
    }
    return false
}
fun sumInRange(x: Int, y: Int) :Int{
    return if (x + y >= 10 && x + y <= 20) 30 else x + y
}
fun fiveInOne(x: Int, y: Int) :Boolean{
    return if (x == 5 || y == 5 || x + y == 5) true else false
}
fun funny13(x: Int) : Boolean{
    return if(x % 13 == 0 || x > 13) true else false
}
fun threeOreSeven(x: Int, y: Int) :Boolean{
    return if(!(x % 3 == 0 && y % 7 == 0) && (x % 3 == 0 || y % 7 == 0)) true else false
}
fun multi10under2(x: Int) :Boolean{
    return if(x % 10 <=2) true else false
}
fun oneFromToIn(x: Int, y: Int) :Int{
    return if(x >= 10 && x <= 20 || y >= 10 && y <= 20) 18 else x + y
}
fun twoAreOne(x: Int, y: Int, z: Int) :Boolean{
    return if(x + y == z) true else false
}
fun whoIsBigger(x: Int, y: Int, z: Int) :Boolean{
    return if(y > x && z > y) true else false
}
fun twoOrMore(x: Int, y: Int, z: Int) :Boolean{
    return if (x % 10 == y % 10 || x % 10 == z %10 || y % 10 == z % 10) true else false
}
fun lessThanTwenty(x: Int, y: Int, z: Int) :Boolean{
    return if(abs(x - y) <= 20 || abs(x - z) <= 20 || abs(y - z) <= 20) true else false
}
fun twoThroughFive(x: Int, y: Int) :Int{
    return if (x == y) 0 else if ((x % 5 == y % 5 && x < y)|| x < y) x else y
}
fun masterThree(x: Int, y: Int) :Boolean{
    return if (x % 10 == y % 10 || x / 10 == y % 10 || x % 10 == y /10 || x /10 == y /10) true else false
}
fun sumOfThree(x: Int, y: Int, z: Int) :Int{
    return if (x == y ) z else x + y + z
}
fun wildTherteen(x: Int, y: Int, z: Int) :Int{
    return if(x % 13 ==0) y + z else if(y % 13 ==0) x + z else if(z % 13 == 0) x +y else x +y + z
 }
fun betweenZero(x: Int, y: Int, z: Int) :Int {
    val a = if (x == 17 || x == 13 || (x > 10 && x < 20)) 0 else x
    val b = if (y == 17 || y == 13 || (y > 10 && y < 20)) 0 else y
    val c = if (z == 17 || z == 13 || (z > 10 && z < 20)) 0 else z
    return a + b + c
}
fun notOverTherteen(x: Int, y: Int) :Int{
    return if(x >= 13 && y >= 13) 0 else if(x - 13 <= 0 && (abs(x - 13) < abs(y - 13))) x else if (y - 13 <=0) y else x
}
fun smallMediumLarge(x: Int, y: Int, z: Int) :Boolean{
    val lst = listOf(x, y, z)
    val listsort = lst.sorted()
    return if (listsort.get(1) - listsort.get(0) == listsort.get(2) - listsort.get(1)) true else false
}
fun equalFirstAndLast(x: IntArray) :Boolean{
    return if (x.first().equals(x.last())) true else false
}
fun sameFirstAndLast(x: IntArray, y: IntArray) :Boolean{
    return if (x.first().equals(y.first()) || x.last().equals(y.last())) true else false
}
fun arraySum(x: IntArray) :Int{
     return x.sum()
}
fun rotateArray(x: IntArray) :IntArray{
    return x.reversed().toIntArray()
}
fun twoToOne(x: IntArray, y: IntArray) :IntArray{       //first try
    var ar1 = x
    var ar2 = y
    ar1 = ar1.filter { it != ar1.first() }.toIntArray()
    ar1 = ar1.filter { it != ar1.last() }.toIntArray()
    ar2 = ar2.filter { it != ar2.first() }.toIntArray()
    ar2 = ar2.filter { it != ar2.last() }.toIntArray()
    var ar3 = ar1 + ar2
    return ar3
}
fun twoToOne2(x: IntArray, y: IntArray) :IntArray{      //second try
    val ar = x.copyOfRange(1,x.size-1) + y.copyOfRange(1,y.size-1)
    return ar
}
fun middleArray(x: IntArray, y: IntArray) :IntArray{    //correct try
    val ar = arrayOf(x.get((x.size/2)-1) , y.get((y.size/2)-1))
    return ar.toIntArray()
}
fun firstAndLastTransfer(x: IntArray) :IntArray{
    return arrayOf(x.first(),x.last()).toIntArray()
}
fun fifteenOrTwenty(x: IntArray) :Boolean{
    return if(x.contains(15) || x.contains(20)) true else false
}
fun notFifteenOrTwenty(x: IntArray) :Boolean{
    return if(x.contains(15) || x.contains(20)) false else true
}