fun fizzBuzz(n: Int): List<String> {
    return (1..n).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "ВизллБизлл"
            it % 3 == 0 -> "Физллл"
            it % 5 == 0 -> "Бизлллл"
            else -> it.toString()
        }
    }
}

fun main() {
    println(fizzBuzz(15))
}
