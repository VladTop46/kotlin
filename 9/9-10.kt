fun longestWord(str: String): String {
    return str.split(Regex("\\W+")).maxByOrNull { it.length } ?: ""
}

fun main() {
    println(longestWord("Пример строки для нахождения самого длинного слова."))
}
