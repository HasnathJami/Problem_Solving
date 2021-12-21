import java.util.Scanner


fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)
    val x:Int=inp.nextInt()
    var c:Int=0;

    for(i in 1..x)  if(x%i==0) c++
    println("$c")
    for(i in 1..x) if(x%i==0) print("$i ")
    println()


}



