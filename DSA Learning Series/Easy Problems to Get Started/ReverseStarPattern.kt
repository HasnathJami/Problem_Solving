import java.util.Scanner

fun main(args:Array<String>)
{
    val inp=Scanner(System.`in`)
    val x=inp.nextInt()

    for(i in 1..x)
    {
        for(k in x-1 downTo  i)
        {
            print(" ")
        }

        for(j in 1..i)
        {
            print("*")
        }
        println()
    }
}