import kotlin.math.sqrt
//2d
fun main() {
    println(doOperation(1,2, 'c'))
    println(doOperation2(2,3,'f'))
}
//2d
fun doOperation (a:Int , b:Int, operation:Char): Double {
    val c = (a + b)
    val operation = operation.toInt()
    val d : Double = c + sqrt(operation.toDouble())
    return d
}

/*
Допишите функцию fun doOperation (a:Int , b:Int, operation:Char): Double
Используя конструкцию when, вычислите значение операции,
указанной в operation. Функция должна корректно обрабатывать
любую допустимую в Kotlin бинарную операцию. Если операция допустима –
генерируйте исключение. Продемонстрируйте работу функции.
*/

fun doOperation2 (a:Int , b:Int, operation:Char): Double {  //2d "when"
    val c = (a + b)
    val operation = operation.toInt()
    var d: Double = c + sqrt(operation.toDouble())
    when (d) {
        5.0,9.0 -> println("What?")
        15.099504938362077 -> println("WTF?")
    }
    return d

}