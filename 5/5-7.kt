import java.util.Scanner

fun main() {
    println("Введите число N")
    val reader = Scanner(System.`in`)
    var n = reader.nextInt()
    var a = 0
    var b = 1
    for (i in 1..n) {
        print("$a ")
        val temp = a
        a = b
        b += temp
    }
}