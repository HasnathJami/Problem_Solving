import java.util.Scanner

fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)
    val x:Int=inp.nextInt()
    val y:Int=inp.nextInt()
    var a:IntArray= IntArray(x)
    var check:Int=0;

    for(i in 0 until x)
        a[i]=inp.nextInt()

    for(i in 0 until x)
    {
        if(a[i]==y)
        {
            check=1;
            break;
        }
    }

    if(check==0) println("-1")
    else println("1")

}



