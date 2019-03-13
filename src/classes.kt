object iterator {
    var id = 1
}

abstract class Animal(val name: String, val year: Int) {
    fun eat() {
        println("${name} is full")
    }

    var id: Int = iterator.id

    init {
        iterator.id += 1
    }

    abstract fun move():String

    abstract fun breath():String

    abstract fun reproduce():String
}
class Mammal(name: String, year: Int): Animal(name, year) {
    override fun move() = "Walks"

    override fun breath() = "Breathe with lungs"

    override fun reproduce() = "Live births"
}

class Birds(name: String, year: Int): Animal(name, year) {
    override fun move() = "Flies"

    override fun breath() = "Breathe with lungs"

    override fun reproduce() = "Eggs"
}

class Fish(name: String, year: Int): Animal(name, year) {
    override fun move() = "Swims"

    override fun breath() = "Breathe with gills"

    override fun reproduce() = "Eggs"
}
