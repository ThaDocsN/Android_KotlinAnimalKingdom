abstract class Animal(val id: Int, val name: String, val year: Int) {
    fun eat() {
        println("${name} is full")
    }

    abstract fun move()

    abstract fun breath()

    abstract fun reproduce()
}