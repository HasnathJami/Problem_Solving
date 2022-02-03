import java.util.Scanner
fun main(args:Array<String>)
{
    val inp=Scanner(System.`in`)
    var t=inp.nextInt()

    while(t-->0)
    {
        val s=inp.next()
        val mid=s.length/2
        var s2=s.substring(0,mid)
        var s4=s2.toCharArray()
        var s6=s4.sorted().joinToString("")
        var s3= if(s.length%2==0) s.substring(mid,s.length)  else s.substring(mid+1,s.length)
        var s5=s3.toCharArray()
        val s7=s5.sorted().joinToString("")
        var res:String= if(s6==s7) "YES" else "NO"
        println(res)


    }
}