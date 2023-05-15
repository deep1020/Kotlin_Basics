fun failing(i: Int): Int {
    val y: Int = throw Exception("boom") // declaring a variable as an Int throws an exception
    return try { // try block
        val x = 42 + 5
        x + y
    } catch (e: Exception) { // catch block
        43
    }
}

fun main() {
    try {
        val result = failing(10)
        println("Result: $result")
    } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }
}
