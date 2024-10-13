fun caesarCipher(text: String, shift: Int): String {
    return text.map {
        when (it) {
            in 'a'..'z' -> ((it - 'a' + shift) % 26 + 'a'.toInt()).toChar()
            in 'A'..'Z' -> ((it - 'A' + shift) % 26 + 'A'.toInt()).toChar()
            else -> it
        }
    }.joinToString("")
}

fun main() {
    println(caesarCipher("Пример Caesar Cipher", 3))  // Сдвиг на 3
}
