abstract class Animal(val id: Int, val name: String, val year: Int) {
    fun consumeFood() {
        println("${name} consumed food")
    }

    abstract fun move()

    abstract fun breath()

    abstract fun reproduce()
}