fun main() {
    print("Введите строку: ")
    val input = readln
    val isPalindrome = input == input.reversed()
    println(if (isPalindrome) "Строка является палиндромом" else "Строка не является палиндромом")
}