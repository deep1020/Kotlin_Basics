//function with Number as the upper bound for T
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}
//function with Comparable as the upper bound for T
fun <T: Comparable<T>> sort(list: List<T>): List<T> {
    return list.sorted()
}
// Multiple constraints -> to signify a upper-bound of “numbers” superclass,
// and another with to signify an upper-bound of comparable types.
fun <T> myMax(a:T,b:T):T where T:Number, T:Comparable<T>
{ return if(a>b) a else b }
fun main(){
    println(oneHalf(3))

    val sortedList = sort(listOf(1,10,30,50,25,4))
    println(sortedList)

    println(myMax(1,10))
}