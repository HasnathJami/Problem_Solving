import java.util.Scanner

fun main(args:Array<String>)
{
    val inp=Scanner(System.`in`)
    val n=inp.nextInt()
    var no=0

    for(i in 1..n)
    {
        if(i%2!=0)
        {
            for(j in 1..5)
            {
                no++;
                print("$no ")

            }
        }

        else{
            var temp=no+5

            for(j in 5 downTo 1)
            {
                print("$temp ")
                temp--;
            }
            no=no+5
        }

        println()
    }
}