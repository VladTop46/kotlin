fun findPrimes(n: Int) {
    for (i in 2..n) {
        if ((2 until i).none { i % it == 0 }) {
            println(i)
        }
    }
}

fun main() {
    findPrimes(50)
}
