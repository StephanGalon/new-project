package com.stephan

import java.util.Locale


fun main(){
//    maps()
//    isLatterTrue()
    // example: text analysis and "can pyramid"(Dosenpyramide)
//    textAnalysis()
    canPyramid()
}

fun canPyramid(){
    val max = 20
    val lines = mutableListOf<List<Int>>()
    lines += List(max) { (1..3).random() }
    fun pyramid( lin: List<List<Int>>){
        val linesNew = mutableListOf<List<Int>>()
        lin.forEach{if (it.size > 1) { linesNew += it.zipWithNext { a, b -> nextColor(a, b)} } }
        lines += linesNew
        if(linesNew.size >= 1) pyramid(linesNew)
    }
    pyramid(lines)
//    var n = 0
//    while( lines[n].size > 1){
//        lines += lines[n].zipWithNext { a, b -> nextColor(a, b) }
//        n += 1
//    }
     lines.reversed().forEach { printCentered(max, it) }
}
fun printCentered(max: Int, lst: List<Int>) {
    print(" ".repeat(max - lst.size)) //It's a loop where the " " repeated whit n times
    lst.forEach { print("$it ") }
    println()
}
fun nextColor(a: Int, b: Int) = if (a == b) a else a.xor(b)
fun textAnalysis(){
    val lorem = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr," +
            " sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat," +
            " sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum." +
            " Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet." +
            " Lorem ipsum dolor sit amet, consetetur sadipscing elitr," +
            " sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat," +
            " sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren," +
            " no sea takimata sanctus est Lorem ipsum dolor sit amet."
    val clean = lorem.lowercase(Locale.getDefault()).replace(Regex("[.,]"), "") //Regex replaces(ersetzt) patter: with replacement:
    val words = clean.split(" ") //Is a List<String>
    println(words)
    val wordsUpper = lorem.uppercase(Locale.getDefault()).replace(Regex("[.,]"), "").split(" ")
    println(wordsUpper)
    println(words.count()); println(words.size)// Is the same??
    val arg = words.map { it.length } //length of single words
    println(arg)
    val arg2 = arg.average() // average(durchschnitt) of the words length
    println(arg2)
    //number of the words over length 6
    val longerThanSix = words
        .filter { it.length > 6 }
        .distinct()
        .count() // distinct()"deletes duplicates" and clearer in own lines
    println(longerThanSix)
    words
        .filter { it.length > 6 }
        .distinct()
        .sorted()
        .forEach { println(it) } // is not the same
   val longerThanSix2 = words
        .filter { it.length > 6 }
        .distinct()
        .sorted()
    println(longerThanSix2)
//    val groups =
        words
        .groupBy { it.length }// maks a Map with all lengts together
//    println(groups)
//    val groups2 =  groups
        .mapValues { it.value.distinct().count() }//deletet doubles and counts
//    println(groups2)
//    val groups3 = groups2
        .toSortedMap() //sorted the Map from small to large
//    println(groups3)
//    groups3
        .forEach{ println("Wörter mit ${it.key}\t Zeichen: ${it.value}") } // outputs all with formatting



}
fun maps(){
    val colores = mapOf("green" to 0x00ff00, "blue" to 0x000ff, "white" to 0xffffff)
    colores.forEach { println("${it.key} <--> ${it.value}") }
//    val bla = mapOf("Hallo" to "du", 2 to 15, "Wie" to "Gehts")
//    bla.forEach { println("${it.key} <--> ${it.value}") }
}
fun isLatterTrue(){
    val lst = "Hello World!"
    val map = lst.associate { char -> char to char.isLetter() }
    println(map)
    val lst2 = "12324544234534"
    val map2 = lst2.associate { it to it.isDigit() }
    println(map2)
}


//    lines.forEach { if (it.size > 1) {lines += it.zipWithNext { a, b -> nextColor(a, b)} } }
//    val linesNew = mutableListOf<List<Int>>()
//    lines.forEach { if (it.size > 1) { linesNew += it.zipWithNext { a, b -> nextColor(a, b)} } }
//    linesNew.reversed().forEach { printCentered(max, it) }
