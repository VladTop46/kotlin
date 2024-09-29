import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Введите первое число: ")
    val a = reader.nextInt()
    print("Введите второе число: ")
    val b = reader.nextInt()
    println("НОД чисел $a и $b: ${gcd(a, b)}")
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}