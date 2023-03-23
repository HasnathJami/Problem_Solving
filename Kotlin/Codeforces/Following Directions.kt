import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    var t = input.nextInt()
    
    while (t-- > 0) {
        var x: Int = 0
        var y: Int = 0
        var check: Boolean = false
        var n = input.nextInt()
        var s = input.next()
        
        for (i in 0 until n) {
            if (s[i] == 'U') {
                y++
            } else if (s[i] == 'D') {
                y--
            } else if (s[i] == 'R') {
                x++
            } else {
                x--
            }
            if (x == 1 && y == 1) {
                check = true
                break
            }
        }
		
        var result = when (check) {
            true -> "YES"
            false -> "NO"
        }
        println(result)
    }

}

