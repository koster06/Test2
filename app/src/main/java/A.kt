//a) Измените класс 'A', чтобы не генерировалось исключение UninitializedPropertyAccessException.

class A {
    private lateinit var prop: String
    //private val prop: String by lazy(::setUp())
    fun setUp() {
        prop = "100 + 200"
    }

    fun display() {
        println(prop)
    }
}
fun main(args: Array<String>) {
    val a = A()
    a.setUp()  //необходимо инициализировать переменную prop
    a.display()
}
