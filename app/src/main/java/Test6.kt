
//4a

/*Напишите 2 лямбды для передачи в функцию, чтобы проверить, содержит ли задуманное коллекция.
Функция any получает предикат в качестве аргумента и возвращает true, если хотя бы один элемент
удовлетворяет предикату.*/

fun main() {

    val sum = {x:Int, y:Int -> x + y }
    doOperation(3, 4, sum)                      // 7
    doOperation(3, 4, {a:Int, b: Int -> a * b}) // 12

}
fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){

    val result = op(x, y)
    println(result)
}

//fun containsIn(collection: Collection): Boolean = collection.any { TODO() }
//fun any():Boolean {
//TODO()
//}
