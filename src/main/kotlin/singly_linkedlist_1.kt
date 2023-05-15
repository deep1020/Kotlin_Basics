// Singly LinkedList implementation using sealed class
sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        // Doesn't have a else branch
    }
fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)),Num(4))))
}