// lambda expression -> filter function
fun main(){
    val greeting : (String) -> Unit = { name: String -> println("Hello there, $name") }
    greeting("CS5035")

    val evenOnly = listOf(1,2,3,4,5,6).filter { it.mod(2) == 0 }
    println(evenOnly)

    val getNamesWith = listOf<String>("Andy","Jackie","Nancy","Jackson").filter{name->name.startsWith("J")}
    println(getNamesWith)

    val addNums: (Int, Int) -> Int = {a:Int, b:Int -> a+b}
    println(addNums)

}