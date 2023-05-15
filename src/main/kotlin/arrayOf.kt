//Create an array of strings called ‘monsters’. The array elements should be
//Godzilla, Mother, and Mechatron.
//• Use a for loop to iterate through the array and print a string of the following type
//for each monster in the array: “<monster name>” is coming.
//• Use the get() method to get the array element at index 1
//• Now use the indexing value to get the array element at index 1
//• Use the set() method to set the array element at index 1 to “King-kong”
//• Print all the elements in the array using the for loop
//• Check if the array has an element named “King-kong” using an if-else statement.

fun main() {
    val monsters = arrayOf("Godzilla", "Mother", "Mechatron")
    for(monster in monsters){
        println("$monster is coming")
    }
    val index1 = monsters.get(1)
    println("Array element at index 1: $index1")
    val index1_ = monsters[1]
    println("Array element at index 1: $index1_")

    monsters.set(1,"King-kong")

    for(monster in monsters){
        println(monster)
    }
    if("King-kong" in monsters){
        println("King-kong found in array")
    }
    else{
        println("King-kong not found in array")
    }

}