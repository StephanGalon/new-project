import java.lang.Math.abs
fun main(args: Array<String>) {

    println(biggestFromFirstSecendThird(intArrayOf(1,2,3,4,10)))
    println(biggestFromFirstSecendThird(intArrayOf(50,2,3,4,1)))
    println(biggestFromFirstSecendThird(intArrayOf(1,2,90,4,2)))//Question 50
}
fun biggestFromFirstSecendThird(x: IntArray) :Int{
    return if(x.first() > x.last() && x.first() > (x.get(x.size / 2))) x.first()
    else if ((x.get(x.size / 2)) > x.last()) x.get(x.size / 2)
    else x.last()
}