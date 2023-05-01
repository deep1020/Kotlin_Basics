//Write a Kotlin program to evaluate the minimum of 2 variables declared within the
//main function.
//• Write a function min() that accepts two variables as parameters and returns
//the minimum value.
//• Declare your variables for evaluation within main() and call your min() function
//from within main()
//• Your code should output the minimum of the two variables.

fun min(a: Int, b: Int): Int{
    return if(a>b) b else a
}
fun main() {
    val number1 = 600
    val number2 = 700
    val minimum_num:Int
    minimum_num = min(number1,number2)
    println("The minimum of the two numbers is: $minimum_num")
}

// output: The minimum of the two numbers is: 600