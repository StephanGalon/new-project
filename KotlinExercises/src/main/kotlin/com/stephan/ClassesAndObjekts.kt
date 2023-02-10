package com.stephan

abstract class Computer(speed: Double, ram: Int, graphics: String){
    private val speed = speed
    private val ram = ram
    private val graphics = graphics
   open fun print(){
        println("------------------------")
        println("Speed: $speed\nRam: $ram\nGraphic Card: $graphics")
    }
    abstract fun turnOn()

}
class Laptop(speed: Double, ram: Int, graphics: String, screen: Double): Computer(speed, ram, graphics){
    private val screen = screen
    override fun print() {
        super.print()
        println("Screen: $screen")
    }

    override fun turnOn() {
        println("open")
        println("press button")
    }
}
class Desktop(speed: Double, ram: Int, graphics: String, lights: Boolean): Computer(speed, ram, graphics){
    private val lights = lights
    override fun print() {
        super.print()
        println("I has lights: $lights")
    }
    override fun turnOn() {
        println("connect to power")
        println("press button")
    }
}
fun main(){
    val desktop = Desktop(4.2,32,"GTX 3080",true)
    val laptop = Laptop(2.1,8,"Intel HD 4000", 15.6)
    val myComputer: Array<Computer> = arrayOf(desktop, laptop)
    for (i in myComputer){
        i.print()
        i.turnOn()
    }
}
