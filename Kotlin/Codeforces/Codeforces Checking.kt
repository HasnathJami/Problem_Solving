import java.util.Scanner

fun main() {

    var input = Scanner(System.`in`)
    var value = "codeforces"
    var t = input.nextInt()
	
    while (t-- > 0) {
        var c = input.next().single()
        var result = if (c in value) "YES" else "NO"
        println(result)
    }
}
