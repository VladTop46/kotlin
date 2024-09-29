fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Введите число для поиска:")
    val target = readLine()?.toIntOrNull()
    if (target != null) {
        val index = numbers.indexOf(target)
        if (index != -1) {
            println("Число $target найдено на индексе $index")
        } else {
            println("Число $target не найдено")
        }
    }
}
