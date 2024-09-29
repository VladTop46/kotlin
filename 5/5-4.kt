import java.util.Scanner

fun main() {
    println("Введите число N")
    val reader = Scanner(System.`in`)
    var n = reader.nextInt()
    var f = factorial(n)
    println("Факториал N: " + f)
}

fun factorial(n: Int): Int {
    require(n >= 0) { "n должен быть больше или равен нулю" }
    return if (n <= 1) {
        1
    } else {
        n * factorial(n-1)
    }
}