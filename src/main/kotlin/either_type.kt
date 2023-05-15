sealed class Either<out E, out A>
data class Left<out E>(val value: E) : Either<E, Nothing>()
data class Right<out A>(val value: A) : Either<Nothing, A>()

fun mean(xs: List<Double>): Either<String, Double> =
    if (xs.isEmpty())
        Left("Mean of empty list")
    else Right(xs.sum()/xs.size)

fun main(){
    val numbers = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val result = mean(numbers)
    when (result) {
        is Left -> println("Error: ${result.value}")
        is Right -> println("Mean: ${result.value}")
    }
}
