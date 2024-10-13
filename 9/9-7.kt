fun switchCase(str: String): String {
    return str.map { if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() }.joinToString("")
}

fun main() {
    println(switchCase("ПрИмЕр СтРоКи"))
}
