import kotlin.math.sqrt

fun main () {
    var count = 0
    val num = 10000
    var list = emptyList<Int>()
    var array = emptyArray<Int>()
    for (n in 1..num) if (isPrime(n)){
        count ++
        if (count<10) list += n
        else if(count >= 10 && count < 30) array += n

    }
    println(list.toString())
    println(array.contentToString())

}

//3b

fun isPrime(x: Int): Boolean {
    if (x < 2) return false
    for (y in 2..sqrt(x.toDouble()).toInt()) {
        if (x % y == 0) return false
    }
    return true
}