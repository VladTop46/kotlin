import java.util.Scanner

fun main() {
    println("Введите число")
    val reader = Scanner(System.`in`)
    var n = reader.nextInt()
    
    var isPrime = true
    if (n < 2) isPrime = false
    for (i in 2 until n) {
        if (n % i == 0) {
            isPrime = false
            break
        }
    }
    println(if (isPrime) "$n - простое" else "$n - не простое")
}