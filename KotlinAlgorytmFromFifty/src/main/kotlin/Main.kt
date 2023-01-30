import java.lang.Math.abs
fun main(args: Array<String>) {

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
//    println(firstthreeThenfive(intArrayOf(1,2,3,2,1,5)))//Question 62

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

    println(invertedNewArray(intArrayOf(5,2,3,12)).contentToString()); println(invertedNewArray(intArrayOf(1,2,3,4,5,6)).contentToString())//Question 68
}
fun biggestFromFirstSecendThird(x: IntArray) :Int{
    return if(x.first() > x.last() && x.first() > (x.get(x.size / 2))) x.first()
    else if ((x.get(x.size / 2)) > x.last()) x.get(x.size / 2)
    else x.last()
}
fun numbersOfEven(x: IntArray) :Int{
    var count = 0
    for (i in 0 until x.size)
       if (x.get(i) % 2 == 0)
           count++
        return count
}
fun arrayNoSeventeen(x: IntArray) :Int{
    var sum = 0
        for (i in 0 until x.size)
            if (x.get(i) != 17)
                sum += x.get(i)
    return sum
}
fun arrayNoSevenFollowedSix(x: IntArray) :Int{
    var sum =0
    for(i in 0 until x.size -1)
        if(x.get(i) != 5 && x.get(i + 1) != 6)
            sum += x.get(i)

    sum += x.last()
    return sum
}
fun noFiveNextToFive(x: IntArray) :Boolean{
    var switch = 0
    for (i in 0 until x.size - 1)
        if (x.get(i) == 5 && x.get(i + 1) == 5) {
            switch = 1
        }else{}
    return if(switch == 0) false else true
}
fun arrayWithfifesAndSevens(x: IntArray) :Boolean{
    var switch = 0
    for (i in 0 until x.size)
        if (x.get(i) == 5) switch = 1 else if (x.get(i) == 7) switch = 1
        else{}
    return if(switch == 1) true else false
}
fun sumOfFivesAreFifteen(x: IntArray): Boolean{
    var sum = 0
    for (i in 0 until x.size)
        if (x.get(i) == 5)
            sum += x.get(i)
    return if(sum == 15) true else false
}
fun sumOfthreesBiggerSumOfFives(x: IntArray) :Boolean{
    var sum3 = 0
    var sum5 = 0
    for (i in 0 until x.size)
        if (x.get(i) == 3)
            sum3 += x.get(i)
        else if (x.get(i) == 5)
            sum5 += x.get(i)
    return if(sum3 > sum5) true else false

}
fun containsTreesOrFives(x: IntArray) :Boolean{
    return if(5 in x || 3 in x) true else false
}
fun noContainsTreesOrFives(x: IntArray) :Boolean{
    return if(5 in x || 3 in x) false else true
}
fun threeToTreeOrFiveToFife(x: IntArray) :Boolean{
    var check =0
    for(i in 0 until x.size -1)
        if((x.get(i) == 3 && x.get(i + 1) == 3) || (x.get(i) == 5 && x.get(i + 1) == 5)) check = 1
        else{}
    return if(check == 1) true else false
}
fun fiveNearFiveOrNot(x: IntArray) :Boolean{
    var check =0
    for(i in 0 until x.size -1)
        if((x.get(i) == 5 && x.get(i + 1) == 5)) check = 1
        else{}
    for (i in 0 until x.size -2)
        if(x.get(i) == 5 && x.get(i + 2) == 5) check = 1
    return if(check == 1) true else false
}
fun firstthreeThenfive(x: IntArray) :Boolean{
    var switch = 0
    var merk = 0
    for (i in 0 until x.size)
        if (x.get(i) == 3) switch = i
        else{}
    for (i in switch until x.size)
        if (x.get(i) == 5) merk =1
    return if(merk == 1) true else false
}
fun twoEvenOrOdd(x: IntArray) :Boolean{
    var switch = 0
    for (i in 0 until x.size -1)
        if((x.get(i)%2 == 0 && x.get(i + 1)%2 == 0) || x.get(i)%2 != 0 && x.get(i + 1)%2 != 0 ) switch =1
    return if(switch == 1) true else false
}
fun fiveFiveFive(x: IntArray) :Boolean{
    var check = 0
    var exclusion = 0
    for (i in 0 until x.size )
        if (x.get(i) == 5) check += 1
    for (i in 0 until x.size - 1)
        if (x.get(i) == 5 && x.get(i + 1) == 5) exclusion = 1
    return if (check >=5 && exclusion == 0) true else false
}
fun everyFiveIsNextTooFive(x: IntArray) :Boolean{
    var check = 0
    var check2 = 0
        for (i in 0 until x.size - 1 )
        if (x.get(i) == 5 && x.get(i +1) == 5) check = 1
    else if ((x.get(i) == 5 && x.get(i + 1) !=5) || (x.get(i) != 5 && x.get(i + 1) ==5)) check2 = 1
    return if (check == 1 && check2 == 0) true else false

}
fun sameElemendsStartEnd(x: IntArray) :Boolean{
    val xfirstSecond = intArrayOf(x.get(0),x.get(1))
    val xlasttwo = intArrayOf(x.get(x.size - 2), x.get(x.size -1))
    return xfirstSecond.contentEquals(xlasttwo)
}
fun threeFollowBigger(x: IntArray) :Boolean{
    var check = 0
    for (i in 0 until x.size - 2)
        if(x.get(i) < x.get(i + 1) && x.get(i + 1) < x.get(i + 2)) check = 1
    return if(check ==1) true else false
}
fun invertedNewArray(x: IntArray) :IntArray {
    val invArray = x.reversedArray()
//    println( invArray === x)
    return invArray
}
