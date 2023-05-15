object Calculate {
    fun abs(n: Int): Int =
        if (n < 0) -n
        else n
    fun factorial(i: Int): Int {
        fun go(n: Int, acc: Int): Int =
            if (n <= 0) acc
            else go(n - 1, n * acc)
        return go(i, 1)
    }
    fun formatAbs(x: Int): String {
        val msg = "The absolute value of %d is %d"
        return msg.format(x, abs(x))
    }
    fun formatFactorial(x: Int): String {
        val msg = "The factorial of %d is %d"
        return msg.format(x, factorial(x))
    }
    fun formatResult(name: String, n: Int, f: (Int) -> Int): String {
        val msg = "The %s of %d is %d."
        return msg.format(name, n, f(n))
    }
}

fun factorial_outside_Calculator(i: Int): Int {
    fun go(n: Int, acc: Int): Int =
        if (n <= 0) acc
        else go(n - 1, n * acc)
    return go(i, 1)
}

fun formatResult_outside_Calculator(name: String, n: Int, f: (Int) -> Int): String {
    val msg = "The %s of %d is %d."
    return msg.format(name, n, f(n))
}

fun main() {

    println(Calculate.formatAbs(-42))
    println(Calculate.formatFactorial(7))
    //This is how you would call a function in the same namespace....
    println(formatResult_outside_Calculator("factorial", 7, ::factorial_outside_Calculator))
    //This is how you would call a function in the namespace of the object Calculator...
    println(Calculate.formatResult("absolute value", -42, Calculate::abs))
}