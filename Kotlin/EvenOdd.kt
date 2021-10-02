fun checker(n:Int):String
{

    return when(n)
    {
        0-> "EVEN"
        else -> "ODD"
    }

}



fun main() {

    var n:Int=Integer.valueOf(readLine())

    println((checker(n%2)))


}