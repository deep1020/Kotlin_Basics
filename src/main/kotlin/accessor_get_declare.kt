//Write an Apartment class in Kotlin. Apartment class should have variables size
//(type: Int or a Double) and isAvailable (type: Boolean). Assume that size is in
//squareFoot.
//• The class should have a custom accessor method called isSuitable. isSuitable
//returns true if the size of the created Apartment object is greater than 500
//squareFeet.
//• Create an object ‘apt1’ in the abc.main function and test your accessor.

class Apartment(val size: Int, val isAvailable: Boolean) {
    val isSuitable: Boolean
        get() {  // accessor getter declaration
            return size > 500
        }
}

fun main(args: Array<String>) {
    val apt1 = Apartment(100, true)
    println("Apartment size: ${apt1.size}, isSuitable: ${apt1.isSuitable}")
}
// output: Apartment size: 100, isSuitable: false