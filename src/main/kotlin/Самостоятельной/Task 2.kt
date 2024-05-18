package Самостоятельной

class `Task 2` {
    interface Flyable {
        val x: String
        fun fly() {
            println("$x is flying")
        }
    }

    class Bird : Flyable {
        override val x = "Bird"
    }

    class Plane : Flyable {
        override val x = "Plane"
    }

    class Superhero : Flyable {
        override val x = "Superhero"
    }

    fun main(args: Array<String>) {
        val f = arrayOf(Bird(), Plane(), Superhero())
        var x = 0
        while (x in 0..2) {
            f[x].fly()
            x++
        }
    }

}