fun failingFn(i: Int): Int {
    return try { // try block
        val x = 42 + 5
        val y: Int = throw Exception("boom") // throwing an exception without type annotation
        x + y
    } catch (e: Exception) { // catch block
        43
    }
}

fun main() {
    try {
        val result = failingFn(10)
        println("Result: $result")
    } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }
}
