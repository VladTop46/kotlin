import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Введите N")
    var n = reader.nextInt()
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    println("Сумма квадратов чисел от 1 до $n: $sum")
}