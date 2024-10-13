fun countVowelsAndConsonants(str: String) {
    val vowels = "aeiouAEIOU"
    var vowelsCount = 0
    var consonantsCount = 0
    
    str.forEach {
        if (it.isLetter()) {
            if (vowels.contains(it)) vowelsCount++
            else consonantsCount++
        }
    }
    println("Гласные: $vowelsCount, Согласные: $consonantsCount")
}

fun main() {
    countVowelsAndConsonants("Пример строки для анализа")
}
