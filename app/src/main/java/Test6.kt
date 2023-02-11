
//4a

/*Напишите 2 лямбды для передачи в функцию, чтобы проверить, содержит ли задуманное коллекция.
Функция any получает предикат в качестве аргумента и возвращает true, если хотя бы один элемент
удовлетворяет предикату.*/

fun main(){

    val  firstList = listOf(1,-4,-2)
    val mult1:(Int,) -> Boolean = { it > 0 }
    val mult2:(Int) -> Boolean = { it <0 }

    val mult1List = containsIn(firstList, mult1)
    val mult2List = containsIn(firstList, mult2)

    println(mult1List)
    println(mult2List)

}

    fun containsIn(myList:List<Int>, any:(Int) -> Boolean ): Boolean {
        var oK = true
        for ( i in myList) {
            oK = any(i)
        }
        return oK
    }

//    val a = 0
//    val collection = listOf<Int>(1,2,3,4,5,6,7,8,9)
//    fun containsIn(collection: List<Int>): Boolean = collection.any { x:Int,y:Int -> Boolean }
//    fun any(collection: List<Int>,a:Int): Boolean {
//        for (i in collection) return i < a
//    }

//fun main() {
//
//    val sum = {x:Int, y:Int -> x + y }
//    doOperation(3, 4, sum)
//    doOperation(3, 4, {a:Int, b: Int -> a * b})
//
//}
//fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){
//
//    val result = op(x, y)
//    println(result)
//}