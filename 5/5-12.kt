import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Введите начальное число: ")
    val start = reader.nextInt()
    print("Введите шаг: ")
    val step = reader.nextInt()
    for (i in 0..9) {
        print("${start + i * step} ")
    }
}