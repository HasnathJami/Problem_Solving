import java.util.Scanner
import kotlin.math.sqrt
import kotlin.math.max
import kotlin.math.min

fun main(args:Array<String>)
{
    val inp=Scanner(System.`in`)
    val a=inp.nextInt()
    val b=inp.nextInt()
    val c=inp.nextInt()

    //val peri:Double=a.toDouble()+b.toDouble()+c.toDouble();
    //val s=peri/2;
    //val area=sqrt(s*(s-a)*(s-b)*(s-c));

    val maxi=max(max(a,b),c)
    val mini=min(min(a,b),c)
    val second=(a+b+c)-maxi-mini;

    if(mini+second>maxi)
    {
        if(a==b && b==c && a==c) println(1)
        else if(a!=b && b!=c && a!=c) println(3)
        else println(2)
    }
    else
        println(-1)


}