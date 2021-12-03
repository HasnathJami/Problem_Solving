import java.util.Scanner

fun maxx(a:Int,b:Int):Int =  if(a>b) a else b
fun minn(a:Int,b:Int):Int = if(a<b) a else b

fun gcd(a:Int,b:Int):Int
{

    var maxi=1
    if(a==0) return b
    if(b==0) return a


    for(i in 2..minn(a,b))
    {
        if(a%i==0 && b%i==0)
        {
            maxi=maxx(maxi,i)
        }
    }


    return maxi

}

fun lcm(a:Int,b:Int):Int
{

    var maxi=maxx(a,b)
    var mini=minn(a,b)

    var store=maxi
    while((maxi%mini)!=0)
    {
        maxi=maxi+store
    }

    return maxi

}


fun main(args: Array<String>)
{
    val inp=Scanner(System.`in`)

    var t =inp.nextInt()

    while(t-->0)
    {
        var a=inp.nextInt()
        var b=inp.nextInt()

        println("${gcd(a,b)} ${lcm(a,b)}")


    }



}