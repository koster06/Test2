//1a

val b : Byte = 127
val c : Int = 1
val d : Double = 2.0

var x = 125
var y = 2
var z = 3.0

//1d
const val VALUE = 45

fun main(){

    //1b - 1c

    c.toString() // из Int в String
    println("из Int в String: $c")
    println("из byte в Int: " + b.toInt()) // из byte в Int
    println("из Int в String: $b")

    //1e

    val lineInt : Int?
    val line = readLine() // принимает только строки
    lineInt = line?.toInt() // конвертируем в Int
    println("You entered a number: $lineInt")

}