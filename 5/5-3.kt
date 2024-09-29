import java.util.Scanner

fun main() {
    println("Введите число N")
    val reader = Scanner(System.`in`)
    var n = reader.nextInt()
    var sum = 0
    for (i in 1..n) {
        sum+=i
    }
    println("Сумма чисел до N: " + sum)
}