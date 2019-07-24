fun main() {
    var dogs = arrayOf(Dog("Fido", 70, "Mixed"), Dog("Ripper", 10, "Poodle"))
}

class Dog(val name: String, var weight: Int, val breed: String) {
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}