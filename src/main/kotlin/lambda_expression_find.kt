// lambda expression -> find function
fun main() {
    val exampleArray = arrayOf(1, 2, 0, 5, -4, 5, -6, 7, 8, 3)
    val findElement = exampleArray.find { it==5 }
    println("$findElement is found in the array")

    val exampleArray2 = arrayOf("CS5112","CS5440","CS5035")
    val findElement2 = exampleArray2.find { it=="CS5035" }
    println("$findElement2 is found in the array")

    val exampleArray3 = arrayOf(1, 2, 0, 5, -4, 5, -6, 7, 8, 3)
    val negativeElement = exampleArray3.find { e -> e<0 }
    println(negativeElement)

    val vals = arrayOf("Hello5035","Goodbye5035")
    val positiveElts = vals.find { e-> e > 0.toString() }
    println("Size of array is: "+vals.size)
    println("Array found in vals is $positiveElts")
}
