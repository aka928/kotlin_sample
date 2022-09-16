data class User(val name: String, var id: Int) {
    object A {
        val b = "b"
    }

    companion object {
        val c = "c"
    }
}

fun main() {

    var user = User("ぽち", 1)


    // run
    val size: Int = mutableListOf("red", "green", "blue").run {
        add("yellow")
        add("black")
        size
    }
    println(size)

    // also
    val numbers = mutableListOf("one", "two", "three")
    numbers.also { println("$it") }.add("four")

    // apply
    val list = mutableListOf(1, 2).apply {
        add(3)
        add(4)
    }
    println(list)




    // with
    val s = with("hoge") { this.length }
    println(s)

    // object
    println(User.A.b)
    println(User.c)

}