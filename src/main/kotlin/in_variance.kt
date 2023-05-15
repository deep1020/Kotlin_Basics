//variance annotations -> out
//Used to declare a type parameter as being covariant.
//• When a type variable T uses an out modifier, this means that a larger type can now have a
//smaller type as a subtype within this complex type (Box).
class Box<in T>(private var item: T) {
    fun setItem(item: T) {
        this.item = item
    }
}

fun main() {
    val numSquare: Box<Number> = Box(1)
    val intSquare: Box<Int> = numSquare
    val doubleSquare: Box<Double> = numSquare

    intSquare.setItem(2)
    doubleSquare.setItem(3.14)

//    val number: Number = numSquare.item
//    println("Number: $number")
}
