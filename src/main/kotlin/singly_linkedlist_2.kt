// Singly LinkedList implementation using interface
interface Expr2
class Num2(val value: Int) : Expr2
class Sum2(val left: Expr2, val right: Expr2) : Expr2
fun eval2(e: Expr2): Int =
    when (e) {
        is Num2 -> e.value
        is Sum2 -> eval2(e.right) + eval2(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
        // Need to have else branch
    }

fun main(args: Array<String>) {
    println(eval2(Sum2(Sum2(Num2(1), Num2(2)),Num2(4))))
}