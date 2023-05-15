fun main() {
    var myString: Any = "Check out this cool string!"
    val myOtherString: String? = myString as? String
    println(myString)

    var myNumber: Any = 42
    val aVariable: Int? = myNumber as Int?
    println(aVariable)

    var myNumber1: Any = 42
    val aVariable1: String? = myNumber1 as? String
    println(aVariable1)

    var myNumber2: Any? = null
    val aVariable2: String? = myNumber2 as String?
    println(aVariable2)
}