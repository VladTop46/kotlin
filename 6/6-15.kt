fun isPalindrome(array: IntArray): Boolean {
    return array.contentEquals(array.reversedArray())
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 2, 1)
    if (isPalindrome(numbers)) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}
