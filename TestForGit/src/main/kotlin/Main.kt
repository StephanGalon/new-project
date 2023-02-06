import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


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

    println(oneValueIn(12, 13)); println(oneValueIn(20, 13)); println(oneValueIn(12, 30))
    println(oneValueIn(22, 24)); println(oneValueIn(24, 55)); println(oneValueIn(23, 21))//Question 12

//    println(nonNegativeValueSameLastDigit(123145, 12312)); println(nonNegativeValueSameLastDigit(1254, 1255))
//    println(nonNegativeValueSameLastDigit(12, 12312)); println(nonNegativeValueSameLastDigit(1000, 10))//Question 13

//    println(numbersequenceInArrayFinder(intArrayOf(0,1,2,3,4,5)))//Question 14

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

//    println(multiTenundertwo(111)); println(multi10under2(77))//Question 21

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

//    println(notFifteenOrTwenty(intArrayOf(1,3,15,6,5))); println(notFifteenOrTwenty(intArrayOf(1,3,6,5,20)))
//    println(notFifteenOrTwenty(intArrayOf(1,3,6,5)))//Question 42

//    println(twoTenAndTwenty(intArrayOf(1,1))); println(twoTenAndTwenty(intArrayOf(1,2))); println(twoTenAndTwenty(intArrayOf(1)))//Question 43

//    println(checkArrayAndSet(intArrayOf(1,5,7)).contentToString()); println(checkArrayAndSet(intArrayOf(1,2,7)).contentToString())//Question 44

//    println(arraySumToCompare(intArrayOf(3,5,7), intArrayOf(5,3,12)).contentToString())//Question 45

//    println(twoFromTheMiddle(intArrayOf(1,2,3,4,5,6)).contentToString())//Question 46

//    println(makeTwoArraysToOne(intArrayOf(30,50,70), intArrayOf(10,20,40)).contentToString())//Question 47

//    println(turnFirstLast(intArrayOf(1,2,3,4,5,6)).contentToString())//Question 48
//
//    println(turnFirstLast2(intArrayOf(1,2,3,4,5,6)).contentToString())//Question 48

//    println(middleThree(intArrayOf(1,2,3,4,5,6,7,8,9)).contentToString())//Question 49


}
// compute the sum of the two given integer values. If the two values are the same, then return triple their sum. 1
fun sum(x: Int, y: Int) :Int {
    val sum = x + y
    return if(x == y) sum * 3 else sum
}


//  get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference. 2
fun absoluteDifference(n: Int) :Int{
    val absoluteDifference= abs(n - 51)
    return if (n>= 51) absoluteDifference * 3 else absoluteDifference
}


// check two given integers, and return true if one of them is 30 or if their sum is 30. 3
fun trueOrNot(x: Int, y: Int) :Boolean{
//    return if (x + y == 30 || x == 30 || y == 30) true else false
    return (x + y == 30 || x == 30 || y == 30)
}


//check a given integer and return true if it is within 10 of 100 or 200. 4
fun whithin(x: Int) :Boolean{
//    return if (x> 10 && x< 200) true else false
    return x in 11 until 200
}


// check whether a given positive number is a multiple of 3 or a multiple of 7. 5
fun multiple(x: Int) :Boolean{
//    return if(x % 7 == 0) true else if(x % 3 == 0) true else false

    return x%7==0 || x%3==0
}


// check whether a given temperatures is less than 0 and the other is greater than 100. 6
fun temperatures(x: Int, y: Int) :Boolean{
//    return if ((x < 0 && y > 100)||(y < 0 && x > 100)) true else false
    val min = min(x , y)
    val max = max(x , y)
    return min < 0 && max > 100

}


// check two given integers whether either of them is in the range 100..200 inclusive. 7
fun between(x: Int, y: Int) :Boolean{
//    return if((x >= 100 && x <= 200)||(y >= 100 && y <= 200)) true else false
    return min(x, y) >= 100 && max(x, y) <= 200
}


// program to check whether three given integer values are in the range 20..50 inclusive.
// Return true if 1 or more of them are in the said range otherwise return false.  8
fun onTwoOrThree(x: Int, y: Int, z: Int) :Boolean{
//        return if ((x >= 20 && x <= 50)||(y >= 20 && y <= 50)||(z >= 20 && z <= 50)) true else false
    return (x in 20..50 || y in 20 .. 50 || z in 20..50)
}


//check whether two given integer values are in the range 20..50 inclusive. Return true if 1 or other is in the said range otherwise false. 9
fun onOreTwo(x: Int, y: Int, z: Int) :Boolean{
//    var a = 0
//    if (x in 20..50) a++
//    if (y in 20..50) a++
//    if (z in 20..50) a++
//    return (a in 1 until 3)
    return (x in 20..50 || y in 20..50 || z in 20..50)
}


// check which number nearest to the value 100 among two given integers. Return 0 if the two numbers are equal. 10
fun nearestZero(x: Int, y: Int) :Int{
   return if (abs(100 - x) == abs(100 - y))  0 else if(abs(100 - x) > abs(100 - y)) return y else return x
}


// check whether two given integers are in the range 40..50 inclusive, or they are both in the range 50..60 inclusive. 11
fun onlyTwoIn(x: Int, y: Int) :Boolean{
//   return if((x >= 40 && x <=50 && y >= 40 && y <= 50) || (x >= 50 && x <=60 && y >= 50 && y <= 60)) true else false
    return (x in 40..50 && y in 40..50) || (x in 50..60 && y in 50..60)
}


// find the larger value from two positive integer values that is in the range 20..30 inclusive, or return 0 if neither is in that range. 12
fun oneValueIn(x: Int, y: Int) :Int{
//    return if((x >= 20 && x <= 30 && y >= 20 && y <= 30)) if (x >= y) x else y
//        else if (x >= 20 && x <= 30) x
//        else if (y >= 20 && y <= 30) y
//    else 0


//    return if(x >= y && x in 20..30 && y in 20..30) x
//        if (x in 20..30) x else if (y in 20..30) y else 0
    return when{
        x >= y && x in 20..30 && y in 20..30 -> x
        x in 20..30 && y in 20..30 -> y
        x in 20..30 -> x
        y in 20..30 -> y
        else -> 0
    }
}


// check if two given non-negative integers have the same last digit. 13
fun nonNegativeValueSameLastDigit(x: Int, y: Int) :Boolean{
    return x % 10 == y % 10
}


//  check whether the sequence of numbers 1, 2, 3 appears in a given array of integers somewhere. 14
fun numbersequenceInArrayFinder(x: IntArray) :Boolean{
    val arr123 = intArrayOf(1,2,3)
//    val xlength= x.size-1
//    var i = 0
//    while(i<=xlength){
//        if (arr123.get(0) == x.get(i) && arr123.get(1) == x.get(i+1) && arr123.get(2) == x.get(i+2))
//        return true
//        i++
//    }
//    return false


//    for(i in 0 until x.size -1)
//        if (arr123[0] == x[i] && arr123[1] == x[i+1] && arr123[2] == x[i+2]) return true
//     return false

    x.forEach { if (arr123[0] == it && arr123[1] == it +1 && arr123[2] == it +2) return true }
        return false
}


//count the number of two 5's are next to each other in an array of integers. Also count the situation where the second 5 is actually a 6. 15
fun countNumber5NextTo(){
    val x = arrayOf(
        arrayOf(5, 5, 2, 3, 5, 5),
        arrayOf(2, 3, 5, 6, 7, 8, 9),
        arrayOf(5, 4, 3, 2, 1, 5, 5))
    var counn = 0
    for (ar in x)
          for (i in 0 until ar.size - 1)
            if (ar[i] == 5 && (ar[i + 1] == 5 || ar[i + 1] == 6))
            counn++
    println(counn)

}


//check if a triple is presents in an array of integers or not. If a value appears three times in a row in an array it is called a triple. 16
fun tripel(x: IntArray) :Boolean{
    for (i in 0 until x.size - 2)
        if (x[i] == x[i + 1] && x[i] == x[i + 2])
        return true
    return false
}


// compute the sum of the two given integers. If the sum is in the range 10..20 inclusive return 30. 17
fun sumInRange(x: Int, y: Int) :Int{
//    return if (x + y >= 10 && x + y <= 20) 30 else x + y
    return if (x + y in 10..20) 30 else x + y
}


//accept two integers and return true if either one is 5 or their sum or difference is 5. 18
fun fiveInOne(x: Int, y: Int) :Boolean{
//    return if (x == 5 || y == 5 || x + y == 5) true else false
    return x == 5 || y == 5 || x + y == 5
}


//test whether a given non-negative number is a multiple of 13 or it is one more than a multiple of 13. 19
fun funny13(x: Int) = x % 13 == 0 || x > 13
//fun funny13(x: Int) : Boolean{
//    return if(x % 13 == 0 || x > 13) true else false
//    return x % 13 == 0 || x > 13
//}


// check whether a given non-negative number is a multiple of 3 or 7, but not both. 20
fun threeOreSeven(x: Int, y: Int) :Boolean{
//    return if(!(x % 3 == 0 && y % 7 == 0) && (x % 3 == 0 || y % 7 == 0)) true else false
    return !(x % 3 == 0 && y % 7 == 0) && (x % 3 == 0 || y % 7 == 0)
}


//  check whether a given number is within 2 of a multiple of 10. 21
fun multiTenUnderTwo(x: Int) :Boolean = x % 10 <= 2
//{
//    return if(x % 10 <=2) true else false
//}


//compute the sum of the two given integers. If one of the given integer value is in the range 10..20 inclusive return 18. 22
fun oneFromToIn(x: Int, y: Int) :Int = if(x in 10..20 || y in 10..20) 18 else x + y
//{
//    return if(x >= 10 && x <= 20 || y >= 10 && y <= 20) 18 else x + y
//}


// check whether it is possible to add two integers to get the third integer from three given integers. 23
fun twoAreOne(x: Int, y: Int, z: Int) = x + y == z
//:Boolean{
//    return if(x + y == z) true else false
//}


//check whether y is greater than x, and z is greater than y from three given integers x,y,z. 24
fun whoIsBigger(x: Int, y: Int, z: Int) = y in (x + 1) until z
//:Boolean{
//    return if(y > x && z > y) true else false
//}


//  check whether two or more non-negative given integers have the same rightmost digit. 25
fun twoOrMore(x: Int, y: Int, z: Int) = x % 10 == y % 10 || x % 10 == z %10 || y % 10 == z % 10
//:Boolean{
//    return if (x % 10 == y % 10 || x % 10 == z %10 || y % 10 == z % 10) true else false
//}


// check three given integers and return true if one of them is 20 or more less than one of the others. 26
fun lessThanTwenty(x: Int, y: Int, z: Int) :Boolean{
//    return if(abs(x - y) <= 20 || abs(x - z) <= 20 || abs(y - z) <= 20) true else false
    return abs(x - y) <= 20 || abs(x - z) <= 20 || abs(y - z) <= 20
}


//find the larger from two given integers. However if the two integers have the same remainder when divided by 5,
//then the return the smaller integer. If the two integers are the same, return 0.  27
fun twoThroughFive(x: Int, y: Int) :Int{
    return if (x == y) 0 else if ((x % 5 == y % 5 && x < y)|| x < y) x else y
}


//check two given integers, each in the range 10..99. Return true if a digit appears in both numbers, such as the 3 in 13 and 33. 28
fun masterThree(x: Int, y: Int) = x % 10 == y % 10 || x / 10 == y % 10 || x % 10 == y /10 || x /10 == y /10
//:Boolean{
//    return if (x % 10 == y % 10 || x / 10 == y % 10 || x % 10 == y /10 || x /10 == y /10) true else false
//}


//compute the sum of three given integers. If the two values are same return the third value. 29
fun sumOfThree(x: Int, y: Int, z: Int) :Int{
    return if (x == y ) z else x + y + z
}


//compute the sum of the three integers. If one of the values is 13 then do not count it and its right towards the sum. 30
fun wildTherteen(x: Int, y: Int, z: Int) :Int{
    return if(x % 13 ==0) y + z else if(y % 13 ==0) x + z else if(z % 13 == 0) x +y else x +y + z
 }


//compute the sum of the three given integers. However, if any of the values is in the range 10..20 inclusive then that value counts as 0, except 13 and 17. 31
fun betweenZero(x: Int, y: Int, z: Int) :Int {
    val a = if (x == 17 || x == 13 || (x in 11 until 20)) 0 else x
    val b = if (y == 17 || y == 13 || (y in 11 until 20)) 0 else y
    val c = if (z == 17 || z == 13 || (z in 11 until 20)) 0 else z
    return a + b + c
}


// check two given integers and return the value whichever value is nearest to 13 without going over. Return 0 if both numbers go over. 32
fun notOverTherteen(x: Int, y: Int) :Int{
    return if(x >= 13 && y >= 13) 0 else if(x - 13 <= 0 && (abs(x - 13) < abs(y - 13))) x else if (y - 13 <=0) y else x
}


//check three given integers (small, medium and large) and return true if the difference between small and medium and
//the difference between medium and large is same. 33
fun smallMediumLarge(x: Int, y: Int, z: Int) :Boolean{
    val lst = listOf(x, y, z)
    val listsort = lst.sorted()
//    return if (listsort.get(1) - listsort.get(0) == listsort.get(2) - listsort.get(1)) true else false
    return listsort[1] - listsort[0] == listsort[2] - listsort[1]
}


//check a given array of integers of length 1 or more and return true if the first element and the last element are equal in the given array. 34
fun equalFirstAndLast(x: IntArray) = x.first() == x.last()
//:Boolean{
//    return if (x.first().equals(x.last())) true else false
//}


//check two given arrays of integers of length 1 or more and return true if they have the same first element or they have the same last element. 35
fun sameFirstAndLast(x: IntArray, y: IntArray) = x.first() == y.first() || x.last() == y.last()
//:Boolean{
//    return if (x.first().equals(y.first()) || x.last().equals(y.last())) true else false
//}


//compute the sum of the elements of a given  array of integers. 36
fun arraySum(x: IntArray) = x.sum()
//:Int{
//     return x.sum()
//}


// rotate the elements of a given array of integers (length 4 ) in left direction and return the new array. 37
fun rotateArray(x: IntArray) = x.reversed().toIntArray()
//:IntArray{
//    return x.reversed().toIntArray()
//}


//reverse a given array of integers and length 5. 38
fun twoToOne(x: IntArray, y: IntArray): IntArray {       //first try
    var ar1 = x
    var ar2 = y
//    ar1 = ar1.filter { it != ar1.first() }.toIntArray()
//    ar1 = ar1.filter { it != ar1.last() }.toIntArray()
//    ar2 = ar2.filter { it != ar2.first() }.toIntArray()
//    ar2 = ar2.filter { it != ar2.last() }.toIntArray()
    ar1 = ar1.filter { it != ar1.first() }.filter { it != ar1.last() }.toIntArray()
    ar2 = ar2.filter { it != ar2.first() }.filter { it != ar2.last() }.toIntArray()
    return ar1 + ar2
}
fun twoToOne2(x: IntArray, y: IntArray) = x.copyOfRange(1,x.size-1) + y.copyOfRange(1,y.size-1)
//:IntArray{      //second try
//    val ar = x.copyOfRange(1,x.size-1) + y.copyOfRange(1,y.size-1)
//    return ar
//}


//create a new array containing the middle elements from the two given arrays of integers, each length 5. 39
fun middleArray(x: IntArray, y: IntArray) = x[(x.size/2)-1] + y[(y.size/2)-1]
//:IntArray{
//    val ar = arrayOf(x.get((x.size/2)-1) , y.get((y.size/2)-1))
//    return ar.toIntArray()
//}


// create a new array taking the first and last elements of a given array of integers and length one or more. 40
fun firstAndLastTransfer(x: IntArray) = x.first() + x.last()
//:IntArray{
//    return arrayOf(x.first(),x.last()).toIntArray()
//}


// check whether a given array of integers of length 2, contains 15 or 20. 41
fun fifteenOrTwenty(x: IntArray) = x.contains(15) || x.contains(20)
//:Boolean{
//    return if(x.contains(15) || x.contains(20)) true else false
//}


// check whether a given array of integers of length 2, does not contain 15 or 20. 42
fun notFifteenOrTwenty(x: IntArray) = !x.contains(15) || !x.contains(20)
//:Boolean{
//    return if(x.contains(15) || x.contains(20)) false else true
//}


// check a given array of integers and return true if the array contains 10 or 20 twice. The length of the array will be 0, 1, or 2. 43
fun twoTenAndTwenty(x: IntArray) = x.size > 1 || x.first() == x.first() + 1
//: Boolean{
//    return if(x.size > 1 || x.first().equals(x.first() + 1)) true else false
//}


//check a given array of integers of length 3 and create a  new array. If there is a 5 in the given array immediately followed by a 7 then set 7 to 1. 44
fun checkArrayAndSet(x: IntArray) :IntArray{
   val lst = x.toMutableList()
    if (lst.size == 3 && lst[1] == 5 && lst[2] == 7) lst[2] = 1
    return lst.toIntArray()
}


//compute the sum of the two given arrays of integers of length 3 and find the array which has the largest sum. 45
fun arraySumToCompare(x: IntArray, y: IntArray) :IntArray{
     return if(x.sum() > y.sum()) x else y
}


//create an array taking two middle elements from a given array of integers of length even. 46
fun twoFromTheMiddle(x: IntArray) = x[x.size /2] + x[(x.size /2) +1]
//:IntArray{
//    val  array = arrayOf(x[x.size /2], x[(x.size /2) +1])
//    return array.toIntArray()
//}


//create a new array from two given array of integers, each length 3. 47
fun makeTwoArraysToOne(x: IntArray, y: IntArray) = x + y
//:IntArray{
//    return x + y
//}


// create a new array swapping the first and last elements of a given array of integers and length will be least 1. 48
fun turnFirstLast(x: IntArray) :IntArray{
    val lst = x.toMutableList()
    lst[0] = lst.last()
    lst[lst.size-1] = x[0]
    return lst.toIntArray()
}
fun turnFirstLast2(x: IntArray): IntArray {
    val rem = x[0]
    x[0] = x.last()
    x[x.size - 1] = rem
    return x
}


// create a new array of length 3 from a given array (length atleast 3) containing the elements from the middle of the array. 49
fun middleThree(x: IntArray) : IntArray{
    val half = x.size / 2
    val array = arrayOf(x[half - 1], x[half], x[half + 1])
    return array.toIntArray()
}
