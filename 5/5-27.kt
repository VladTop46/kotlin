fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull() ?: return

    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}