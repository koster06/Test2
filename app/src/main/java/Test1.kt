
fun main() {
    println(factorial(6))
    println(factorial2(6))
}

//3a

fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)

fun factorial2(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i
    }
    return result
}