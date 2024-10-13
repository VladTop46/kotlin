import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*"
    return (1..length).map { chars[Random.nextInt(chars.length)] }.joinToString("")
}

fun main() {
    println(generatePassword(12))
}
