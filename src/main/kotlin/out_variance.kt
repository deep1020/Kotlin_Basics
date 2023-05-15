//variance annotations -> out
//Used to declare a type parameter as being covariant.
//When a type variable T uses an out modifier, this means that a larger type can now have a
//smaller type as a subtype within this complex type (square)
class Square<out T>(private val item: T) {
    fun getItem(): T = item
}
fun main() {
    val intSquare: Square<Int> = Square(1)
    val numSquare: Square<Number> = intSquare

    val number: Number = numSquare.getItem()
    println("Number: $number")
}
