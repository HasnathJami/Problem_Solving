import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    var t = input.nextInt()

    while (t-- > 0) {
        var n = input.nextInt()
        var s = input.next()
        var p1 = 0
        var p2 = n - 1
        var count = 0

        if (n == 1) {
            println(n)
            continue
        }

        if (s[p1] == '0' && s[p2] == '0' || s[p1] == '1' && s[p2] == '1') {
            println(n)
            continue
        }

        while (p1 <= p2) {
            if (s[p1] == '0' && s[p2] == '1') {
                count += 2
            } else if (s[p1] == '1' && s[p2] == '0') {
                count += 2
            } else {
                break
            }

            p1++
            p2--
        }
        println(n - count)
    }
}

