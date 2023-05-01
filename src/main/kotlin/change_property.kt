//Navigate to REPL in IntelliJ IDE
//2. Create a data class “Movie” with properties “name” and “releaseDate”.
//3. Create an object “movie1”
//4. Try changing a property of movie1 like you would change the property of a class,
//e.g. movie1.releaseDate= 2004. Does it work?
//5. Now, try changing the same property using the copy() method.
//6. Use the toString() method to print the object as a string.
//7. Use the equals() method to compare the objects you created in 3 and 5.

data class Movie(val name: String, var releaseDate: Int)

fun main(args : Array<String>){
    val movie1 = Movie("XYZ",2005)
    movie1.releaseDate=2007
    movie1.toString()
    val movie2 = movie1.copy()
    val movie3 = movie1.copy("XYZ")

    println(movie1)
    println(movie2)
    println(movie3)
    println(movie1 == movie3)
}

// output:
//Movie(name=XYZ, releaseDate=2007)
//Movie(name=XYZ, releaseDate=2007)
//Movie(name=XYZ, releaseDate=2007)
//true