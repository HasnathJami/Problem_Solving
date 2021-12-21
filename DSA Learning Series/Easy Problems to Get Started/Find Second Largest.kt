import java.util.Scanner
import kotlin.math.max
import kotlin.math.min


fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)
    val x:Int=inp.nextInt()
    val y:Int=inp.nextInt()
    val z:Int=inp.nextInt()

    var maxi=max(max(x,y),z)
    var mini=min(min(x,y),z)
    println("${(x+y+z)-maxi-mini}")





}



