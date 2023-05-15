//type signatures of a common generic higher-order function
//filter: filters a list based on a function parameter.
fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T> {
    val filteredList = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            filteredList.add(item)
        }
    }
    return filteredList
}
//slice: returns a list containing only elements at indices in a specified range.
fun <T> List<T>.slice(indices: IntRange): List<T> {
    val slicedList = mutableListOf<T>()
    for (index in indices) {
        if (index in 0 until size) {
            slicedList.add(this[index])
        }
    }
    return slicedList
}

fun main() {
    val authors = listOf("Dmitry", "Svetlana")
    val readers = listOf("Anna", "Dmitry", "John", "Svetlana")
    val filteredReaders = readers.filter { it !in authors }
    println("Filtered readers: $filteredReaders")

    val letters = ('a'..'z').toList()
    val slicedLetters = letters.slice<Char>(0..2)
    println("Sliced letters: $slicedLetters")
}
