abstract class Animal(val id: Int, val name: String, val year: Int) {
    fun eat() {
        println("${name} is full")
    }

    abstract fun move():String

    abstract fun breath():String

    abstract fun reproduce():String
}
class Mammal(id: Int, name: String, year: Int): Animal(id, name, year) {
    override fun move() = "Walks"

    override fun breath() = "Breathe with lungs"

    override fun reproduce() = "Live births"
}

class Birds(id: Int, name: String, year: Int): Animal(id, name, year) {
    override fun move() = "Flies"

    override fun breath() = "Breathe with lungs"

    override fun reproduce() = "Eggs"
}

class Fish(id: Int, name: String, year: Int): Animal(id, name, year) {
    override fun move() = "Swims"

    override fun breath() = "Breathe with gills"

    override fun reproduce() = "Eggs"
}
