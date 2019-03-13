fun main() {
    var animalList = mutableListOf(
        Mammal("Panda", 1869),
        Mammal("Zebra", 1778),
        Mammal("Koala", 1816),
        Mammal("Sloth", 1804),
        Mammal("Armadillo", 1758),
        Mammal("Raccoon", 1758),
        Mammal("Bigfoot", 2021),

        Birds("Pigeon", 1837),
        Birds("Peacock", 1821),
        Birds("Toucan", 1758),
        Birds("Parrot", 1824),
        Birds("Swan", 1758),

        Fish("Salmon", 1758),
        Fish("Catfish", 1817),
        Fish("Perch", 1758)
    )
}
fun animalsDescOrder(list: MutableList<Animal>) {
    list.sortByDescending { it.year }
}
fun sortByName(list: MutableList<Animal>) {
    list.sortedBy { it.name }
}

fun sortByMove(list: MutableList<Animal>) {
    list.sortedBy { it.move() }
}