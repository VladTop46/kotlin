import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Введите число: ")
    val number = reader.nextInt()
    val sum = number.toString().map { it.toString().toInt() }.sum()
    println("Сумма цифр числа: $sum")
}