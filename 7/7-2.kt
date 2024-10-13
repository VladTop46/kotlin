fun isPalindrome(word: String): Boolean {
    val normalizedWord = word.lowercase().replace(Regex("[^a-zA-Z0-9]"), "")
    return normalizedWord == normalizedWord.reversed()
}

fun main() {
    println("Введите слово:")
    val word = readLine()!!
    if (isPalindrome(word)) {
        println("$word является палиндромом")
    } else {
        println("$word не является палиндромом")
    }
}