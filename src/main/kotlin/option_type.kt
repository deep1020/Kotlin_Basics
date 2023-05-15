sealed class Option<out A>
data class Some<out A>(val get: A) : Option<A>()
object None : Option<Nothing>()
fun find_mean(xs: List<Double>): Option<Double> =
    if (xs.isEmpty()) None
    else Some(xs.sum() / xs.size)

fun main() {
    val numbers = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val result = find_mean(numbers)
    when (result) {
        is Some -> println("Mean: ${result.get}")
        is None -> println("Empty list")
    }
}
