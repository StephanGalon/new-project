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
    println(onOreTwo(12,3,7)); println(onOreTwo(22,3,7)); println(onOreTwo(22,33,7))
    println(onOreTwo(22,33,45))//Question 9

}
fun sum(x: Int, y: Int) :Int {
    val sum = x + y
    return if(x == y) sum * 3 else sum
}
fun absoluteDifference(n: Int) :Int{
    val absoluteDifference= if (n> 51) n-51 else 51- n
    return if (n>= 51) n * 3 else absoluteDifference
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