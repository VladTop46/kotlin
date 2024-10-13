fun isAnagram(str1: String, str2: String): Boolean {
    return str1.toLowerCase().toCharArray().sorted() == str2.toLowerCase().toCharArray().sorted()
}

fun main() {
    println(isAnagram("listen", "silent"))
}
