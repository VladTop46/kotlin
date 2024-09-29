import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Введите высоту лестницы")
    var n = reader.nextInt()
    for (n in 1..n) {
        println('#')
        var n2 = n * 2
        for (n2 in 1..n2) {
            print('#') 
        }
    }
}