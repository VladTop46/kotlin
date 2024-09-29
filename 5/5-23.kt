fun main() {
    while (true) {
        println("Введите две цифры через пробел или 'стоп' для выхода:")
        val input = readLine()
        if (input.equals("стоп", ignoreCase = true)) break

        val numbers = input?.split(" ")?.mapNotNull { it.toIntOrNull() }
        if (numbers == null || numbers.size != 2) {
            println("Неправильный ввод. Попробуйте ещё раз.")
            continue
        }

        val (a, b) = numbers
        println("Введите 'сложение' или 'умножение' для выбора операции:")
        when (readLine()) {
            "сложение" -> println("Результат сложения: ${a+b}")
            "умножение" -> println("Результат умножения: ${a*b}")
            else -> println("неверная операция")
        }
    }
}