import java.util.Scanner
import kotlin.math.sqrt
import kotlin.math.sin

fun main(args:Array<String>)
{
    val inp=Scanner(System.`in`)
    val a=inp.nextInt()
    val b=inp.nextInt()
    val c=inp.nextInt()



    if(a+b+c==180  && a>0 && b>0 && c>0)
    {
        println("YES")
    }
    else
        println("NO")


}