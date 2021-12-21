import java.util.Scanner


fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)
    val x:Int=inp.nextInt()
    var r:String= if( x%5==0 && x%11==0) "BOTH"   else if (x%5==0 || x%11==0) "ONE"  else "NONE"
    println(r)

}



