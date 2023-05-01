// return the student with the highest score in a subject.
data class Student(val subject:String?=null ,val score: Int)

fun main(args: Array<String>) {
    val std = listOf(Student("FP",80), Student(score = 70))
    val highest_score = std.maxBy { it.score ?: 0 }
    println("The Highest Score is: $highest_score")
}
// output: The Highest Score is: Student(subject=FP, score=80)
