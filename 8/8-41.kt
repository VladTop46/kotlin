fun countVowels(str: String): Int {
    val vowels = "aeiouAEIOU"
    return str.count { it in vowels }
}