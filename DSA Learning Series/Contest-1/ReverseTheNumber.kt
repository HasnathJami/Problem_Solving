import java.util.Scanner
fun main(args:Array<String>)
{
    val inp=Scanner(System.`in`)
    var t=inp.nextInt()

    while(t-->0)
    {

        var n=inp.nextInt()
        var result=0

        while(n>0)
        {
            var rem=n%10
            result =(result*10) + rem
            n /= 10
        }

        println(result)

    }
}