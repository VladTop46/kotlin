fun main() {
    print("Введите первую строку: ")
    val str1 = readln()
    print("Введите вторую строку: ")
    val str2 = readln()
    val isAnagram = str1.toLowerCase().toList().sorted() == str2.toLowerCase().toList().sorted()
    println(if (isAnagram) "Строки являются анаграммами" else "Строки не являются анаграммами")
}