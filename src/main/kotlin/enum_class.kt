//getColor function uses a ‘when’ expression and returns the name of the color
//matching a named constant from the enum class as a String.
//• For example: if your program invoked getColor with the named constant BLUE, it
//would return “Blue” as a string.
//• getColor is similar to testColor from the previous example, but uses an exhaustive
//list of all named constants.

//'when' is Similar to switch statement — matches its argument against all branches
//sequentially until a branch condition is met
import java.lang.Exception

enum class CLR (val r:Int, val g:Int, val b:Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130,
        238);
    fun rgb() = (r * 256 + g) * 256 + b //method on enum class
}
fun getColor(input: CLR) =
    when (input)
    {
        CLR.BLUE -> "blue"
        else -> throw Exception("something but blue")
    }
fun main(){
    println(getColor(CLR.BLUE))
}