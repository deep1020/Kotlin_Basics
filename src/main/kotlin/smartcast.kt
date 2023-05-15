// smart cast -> check whether a variable is of a certain type by using an is check.
//'is' keyword is used to match each logic branch by its concrete type.
fun printInt(input: Any): Int {
    return when(input){
        is Int -> input
        is Double -> input.toInt()
        is String -> input.length
        is IntArray -> input.sum()
        else -> -1
    }
}
fun main(){
    println(printInt(intArrayOf(1,2,3)))
    println(printInt(10.0))
    println(printInt("Example"))
}