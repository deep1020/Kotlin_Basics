val sum = { x: Int, y: Int, z: Int ->
    if(x<y) {
        x + y
    }
    else {
        x + z
    }
}
fun main(args : Array<String>){
    val x=2
    val y=1
    val z=4
    println("Computing the sum of x is $x, y is $y and z is $z")
    println("Computing the sum of above: "+sum(x,y,z))
}