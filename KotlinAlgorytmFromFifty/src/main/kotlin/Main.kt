import java.util.Collections

fun main() {

//    println(biggestFromFirstSecendThird(intArrayOf(1,2,3,4,10)))
//    println(biggestFromFirstSecendThird(intArrayOf(50,2,3,4,1)))
//    println(biggestFromFirstSecendThird(intArrayOf(1,2,90,4,2)))//Question 50

//    println(numbersOfEven(intArrayOf(1,2,3,4,5,6,7,8,9,10)))//Question 51

//    println(arrayNoSeventeen(intArrayOf(1,2,3,4,5,6,7,8,9,10)))
//    println(arrayNoSeventeen(intArrayOf(17,1)))//Question 52

//    println(arrayNoSevenFollowedSix(intArrayOf(1,2,3,4,5,6,7,8,9)))//Question 53

//    println(noFiveNextToFive(intArrayOf(1,2,3,4,5,5,7,8,9)))
//    println(noFiveNextToFive(intArrayOf(1,2,3)))//Question 54

//    println(arrayWithfivesAndSevens(intArrayOf(1,2,3,7))); println(arrayWithfivesAndSevens(intArrayOf(1,2,3,5)))
//    println(arrayWithfivesAndSevens(intArrayOf(1,2,3,4,6)));println(arrayWithfivesAndSevens(intArrayOf(1,2,5,7)))//Questrion 55

//    println(sumOfFivesAreFifteen(intArrayOf(5,5,5))); println(sumOfFivesAreFifteen(intArrayOf(1,2,3,5,5)))
//    println(sumOfFivesAreFifteen(intArrayOf(1,2,5,5,5,5,6)));println(sumOfFivesAreFifteen(intArrayOf(1,2,5,7)))//Questrion 56

//    println(sumOfthreesBiggerSumOfFives(intArrayOf(3,3,5))); println(sumOfthreesBiggerSumOfFives(intArrayOf(3,3,3,5,5)))//Question 57

//    println(containsTreesOrFives(intArrayOf(1,2,3))); println(containsTreesOrFives(intArrayOf(1,2)))
//    println(containsTreesOrFives(intArrayOf(1,2,3,5)))//Question 58

//    println(noContainsTreesOrFives(intArrayOf(1,2,3))); println(noContainsTreesOrFives(intArrayOf(1,2)))
//    println(noContainsTreesOrFives(intArrayOf(1,2,3,5)))//Question 59

//    println(threeToTreeOrFiveToFive(intArrayOf(1,3,3))); println(threeToTreeOrFiveToFive(intArrayOf(1,3,3,5,5)))
//    println(threeToTreeOrFiveToFive(intArrayOf(1,2,5,5))); println(threeToTreeOrFiveToFive(intArrayOf(1,3,5)))//Question 60

//   println(fiveNearFiveOrNot(intArrayOf(5,5))); println(fiveNearFiveOrNot(intArrayOf(1,3,3,5,5)))
//   println(fiveNearFiveOrNot(intArrayOf(1,2,5,4,5))); println(fiveNearFiveOrNot(intArrayOf(1,3,5)))//Question 61

//    println(firstthreeThenfive(intArrayOf(1,2,3,5))); println(firstthreeThenfive(intArrayOf(1,2,5,3)))
//    println(firstthreeThenfive(intArrayOf(1,2,3,2,5,3,4)))//Question 62

//    println(twoEvenOrOdd(intArrayOf(1,2,4,1,2))); println(twoEvenOrOdd(intArrayOf(1,2,3,1,2)))
//    println(twoEvenOrOdd(intArrayOf(1,2,3,4,5,6)))//Question 63

//    println(fiveFiveFive(intArrayOf(5,4,5,4,5,4,5,4,5))); println(fiveFiveFive(intArrayOf(5,5,4,5,4,5,4,5)))
//    println(fiveFiveFive(intArrayOf(1,2,3,4,5)))//Question 64


//    println(everyFiveIsNextTooFive(intArrayOf(5,5,5,5,4,5,5)))
//    println(everyFiveIsNextTooFive(intArrayOf(5,5,5,5)))//Question 65

//    println(sameElemendsStartEnd(intArrayOf(1,2,3,1,2)))
//    println(sameElemendsStartEnd(intArrayOf(5,5,4,5)))//Question 66

//    println(threeFollowBigger(intArrayOf(1,2,3))); println(threeFollowBigger(intArrayOf(1,3,2)))
//    println(threeFollowBigger(intArrayOf(5,2,3,12)))//Question 67

//    println(invertedNewArray(intArrayOf(5,2,3,12)).contentToString()); println(invertedNewArray(intArrayOf(1,2,3,4,5,6)).contentToString())//Question 68
//    println(invertedNewArray2(intArrayOf(5,2,3,12)).contentToString()); println(invertedNewArray2(intArrayOf(1,2,3,4,5,6)).contentToString())//Question 68

//    println(onlyUpToFive(intArrayOf(1,2,3,4,5,6,7,8)).contentToString())//Question 69

//    println(onlyAfterFive(intArrayOf(1,2,3,4,5,6,7,8)).contentToString())//Question 70
//   println(onlyAfterFive2(intArrayOf(1,2,3,4,5,6,7,8)).contentToString())//Question 70

//    println(allZerosToLeft(intArrayOf(5,12,0,2,0,0,3,4,5,6)).contentToString())//Question 71

//    println(allFivesToZeroAndRight(intArrayOf(1,2,5,3,4,5,6,7,5)).contentToString())// Question 72
//    println(allFivesToZeroAndRight2(intArrayOf(1,2,5,3,4,5,6,7,5)).contentToString())// Question 72
//
//    println(firstAllEven(intArrayOf(1,2,5,3,4,5,6,0,7,5)).contentToString())//Question 73

//    println(greaterOrEqualThePrevious(intArrayOf(1,2,3,4))); println(greaterOrEqualThePrevious(intArrayOf(5,3,4)))//Question 74

    println(fifteenTwin(intArrayOf(12,13,14,15,15))); println(fifteenTwin(intArrayOf(12,13,14,15)))//Question 75

}

// find the largest value from first, last, and middle elements of a given array of integers of odd length (atleast 1). 50
fun biggestFromFirstSecendThird(x: IntArray) :Int{
    return if(x[0] > x.last() && x[0] > (x[x.size / 2])) x.first()
    else if ((x[x.size / 2]) > x.last()) x[x.size / 2]
    else x.last()
}


// count number of even elements in a given array of integers. 51
fun numbersOfEven(x: IntArray) :Int{
    var count = 0
    for (ini in x)
       if (ini % 2 == 0)
           count++
        return count
}


//compute the sum of values in a given array of integers except the number 17. Return 0 if the given array has no integer. 52
fun arrayNoSeventeen(x: IntArray) :Int{
    var sum = 0
        for (i in x.indices)
            if (x[i] != 17)
                sum += x[i]
    return sum
}


//compute the sum of the numbers in a given array except those numbers starting with 5 followed by atleast one 6. 53
// Return 0 if the given array has no integer.
fun arrayNoSevenFollowedSix(x: IntArray) :Int{
    var sum =0
    for(i in 0 until x.size -1)
        if(x[i] != 5 && x[i + 1] != 6)
            sum += x[i]

    sum += x.last()
    return sum
}


//check whether a given array of integers contains 5 next to a 5 somewhere. 54
fun noFiveNextToFive(x: IntArray) :Boolean{
    var switch = 0
    for (i in 0 until x.size - 1)
        if (x[i] == 5 && x[i + 1] == 5)
            switch = 1
    return switch == 0
}


// check whether a given array of integers contains 5's and 7's. 55
fun arrayWithfifesAndSevens(x: IntArray) :Boolean{
    var switch = 0
    for (i in x.indices)
        if (x[i] == 5) switch = 1 else if (x[i] == 7) switch = 1
       return switch == 1
}


//check whether the sum of all 5' in the array exactly 15 in a given array of integers. 56
fun sumOfFivesAreFifteen(x: IntArray): Boolean{
    var sum = 0
    for (i in x.indices)
        if (x[i] == 5)
            sum += x[i]
    return sum == 15
}


// check whether the number of 3's is greater than the number of 5's. 57
fun sumOfthreesBiggerSumOfFives(x: IntArray) :Boolean{
    var sum3 = 0
    var sum5 = 0
    for (i in x.indices)
        if (x[i] == 3)
            sum3 += x[i]
        else if (x[i] == 5)
            sum5 += x[i]
    return sum3 > sum5

}


//check whether a given array of integers contains a 3 or a 5. 58
fun containsTreesOrFives(x: IntArray) = 5 in x || 3 in x
//:Boolean{
//    return if(5 in x || 3 in x) true else false
//}


// check  whether a given array of integers contains no 3 or a 5. 59
fun noContainsTreesOrFives(x: IntArray) =5 !in x || 3 !in x
//:Boolean{
//    return if(5 in x || 3 in x) false else true
//}


//check whether an array of integers contains a 3 next to a 3 or a 5 next to a 5 or both. 60
fun threeToTreeOrFiveToFife(x: IntArray) :Boolean{
    var check =0
    for(i in 0 until x.size -1)
        if((x[i] == 3 && x[i + 1] == 3) || (x[i] == 5 && x[i + 1] == 5)) check = 1
       return check == 1
}


//check a given array of integers and return true if the given array contains two 5's next to each other, or two 5 separated by one element. 61
fun fiveNearFiveOrNot(x: IntArray) :Boolean{
    var check =0
    for(i in 0 until x.size -1)
        if((x[i] == 5 && x[i + 1] == 5)) check = 1
    for (i in 0 until x.size -2)
        if(x[i] == 5 && x[i + 2] == 5) check = 1
    return check == 1
}


//check a given array of integers and return true if there is a 3 with a 5 somewhere later in the given array. 62
fun firstthreeThenfive(x: IntArray) :Boolean{
    var switch = 0
    var merk = 0
    for (i in x.indices)
        if (x[i] == 3) switch = i
    for (i in switch until x.size)
        if (x[i] == 5) merk =1
    return merk == 1
}


// check a given array of integers and return true if the given array contains either 2 even or 2 odd values all next to each other. 63
fun twoEvenOrOdd(x: IntArray) :Boolean{
    var switch = 0
    for (i in 0 until x.size -1)
        if((x[i] %2 == 0 && x[i + 1] %2 == 0) || x[i] %2 != 0 && x[i + 1] %2 != 0 ) switch =1
    return switch == 1
}


//check a given array of integers and return true if the value 5 appears 5 times and there are no 5 next to each other. 64
fun fiveFiveFive(x: IntArray) :Boolean{
    var check = 1
    var exclusion = 0
    for (i in x.indices )
        if (x[i] == 5) check += 1
    for (i in 0 until x.size - 1)
        if (x[i] == 5 && x[i + 1] == 5) exclusion = 1
    return check >=5 && exclusion == 0
}


// check a given array of integers and return true if every 5 that appears in the given array is next to another 5. 65
fun everyFiveIsNextTooFive(x: IntArray) :Boolean {
    var check = 0
    var check2 = 0
//    for (i in 0 until x.size - 1 )
//        if (x[i] == 5 && x[i +1] == 5) check = 1
//        else if ((x[i] == 5 && x[i + 1] !=5) || (x[i] != 5 && x[i + 1] ==5)) check2 = 1
//    return check == 1 && check2 == 0
    for (i in 0 until x.size - 1)
        if ((x[i] + x[i + 1]) == 10)  check = 1
    else {check2 = 1}
    return check == 1 && check2 == 0
}


//check a given array of integers and return true if the specified number of same elements appears at the start and end of the given array. 66
fun sameElemendsStartEnd(x: IntArray) :Boolean{
    val firsSeco = intArrayOf(x[0], x[1])
    val lasttwo = intArrayOf(x[x.size - 2], x[x.size -1])
    return firsSeco.contentEquals(lasttwo)
}


//check a given array of integers and return true if the array contains three increasing adjacent numbers. 67
fun threeFollowBigger(x: IntArray) :Boolean{
//    var check = 0
//    for (i in 0 until x.size - 2)
//        if(x[i] < x[i + 1] && x[i + 1] < x[i + 2]) check = 1
//    return check ==1
    var check = false
    for (i in 0 until x.size - 2)
        if(x[i] < x[i + 1] && x[i + 1] < x[i + 2]) check = true
    return check
}


// shift an element in left direction and return a new array. 68
fun invertedNewArray(x: IntArray): IntArray {
      return x.reversedArray()
}
fun invertedNewArray2(x: IntArray) = x.reversedArray() //the same?? yes


// create a new array taking the elements before the element value 5 from a given array of integers. 69
fun onlyUpToFive(x: IntArray) = x.filter { it != 5 }.toIntArray()
//:IntArray{
//    var toFive = mutableListOf<Int>()
//    var trigger = 0
//   var i = 0
//    while ((i < x.size) && trigger == 0) {
//        if (x.get(i) == 5) {
//            trigger = 1
//        }else {
//            toFive.add(x.get(i))
//        }
//        i++
//    }

//    for(i in x.indices)
//        if (x[i] != 5)
//            toFive.add(x[i])
//        else break
//    return toFive.toIntArray()

//}


// create a new array taking the elements after the element value 5 from a given array of integers. 70
fun onlyAfterFive(x: IntArray) :IntArray {
    val toFive = mutableListOf<Int>()
    for (i in x.indices)
        if (x[i] > 5)
            toFive.add(x[i])
    return toFive.toIntArray()
}
fun onlyAfterFive2(x: IntArray) :IntArray {      //better ??
    val indexFive = x.indexOf(5) +1
    return x.copyOfRange(indexFive, x.size)
}



//create a new array from a given array of integers shifting all zeros to left direction. 71
fun allZerosToLeft(x: IntArray) :IntArray{
//    val zeros = mutableListOf<Int>()
//    for (i in x.indices)
//        if (x[i] != 0)
//            zeros.add(x[i])
//        else
//            zeros.add(0, x[i])
//    return zeros.toIntArray()
    return x.sortedArray() // the question -->  not sorted array
}


// create a new array after replacing  all the values 5 with 0 shifting all zeros to right direction. 72
fun allFivesToZeroAndRight(x: IntArray) :IntArray{
    val zeros = x.toMutableList()
    val zerosort1 = mutableListOf<Int>()
    val zerosort2 = mutableListOf<Int>()
    Collections.replaceAll(zeros, 5 ,0)
    for (i in 0 until zeros.size)
        if (zeros[i] != 0)
            zerosort1.add(zeros[i])
        else
            zerosort2.add(zeros[i])
    return zerosort1.toIntArray() + zerosort2
}
fun allFivesToZeroAndRight2(x: IntArray) :IntArray{         //better??
    val blub = x.filter { it != 5  }
    val zeros = x.filter { it == 5 }.map { 0 }
    return blub.toIntArray() + zeros
}


//create new array from a given array of integers shifting all even numbers before all odd numbers. 73
fun firstAllEven(x: IntArray) :IntArray {
//    val even = mutableListOf<Int>()
//    val odd = mutableListOf<Int>()
//       for (i in x.indices)
//        if (x[i] % 2 == 0) even.add(x[i])
//        else odd.add(x[i])
//    return even.toIntArray() + odd
    val even = x.filter { it %2 == 0 }
    val odd = x.filter { it %2 != 0 }
    return even.toIntArray() + odd
}


//check whether the value of each element is equal or greater than the value of previous element of a given array of integers. 74
fun greaterOrEqualThePrevious(x: IntArray) :Boolean{
//    println(x.contentToString())
    var switch = 0
    for (i in 1 until x.size)
        if(x[i] < x[i -1]) switch = 1
            return switch == 0
}


// check a given array (length will be atleast 2) of integers and return true if there are two values 15, 15 next to each other. 75
fun fifteenTwin(x: IntArray) :Boolean{
    var switch = 0
    for (i in 0 until x.size - 1)
        if (x[i] == 15 && x[i + 1] == 15)
            switch = 1
    return switch != 0
}