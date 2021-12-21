import java.util.Scanner

fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)
    val x:Int=inp.nextInt()
    
    var a= IntArray(x)

    for(i in 0 until x)
        a[i]=inp.nextInt()

    //var b=a.reversedArray()
    a.reverse()

    for(i in a)
    {
        print("$i ")
    }

    println()
}



