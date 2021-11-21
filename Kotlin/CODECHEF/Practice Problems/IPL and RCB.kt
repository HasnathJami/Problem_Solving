import java.util.Scanner

fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)
    var t=inp.nextInt()

    while(t-->0)
    {
       val x=inp.nextInt()
       val y=inp.nextInt()

        if(x>y)
            println(x-y)

        else
            println(0)


    }
}