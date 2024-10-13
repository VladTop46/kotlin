fun sortStrings(arr: Array<String>): Array<String> {
    return arr.sortedArray()
}

fun main() {
    val strings = arrayOf("banana", "apple", "cherry")
    println(sortStrings(strings).joinToString(", "))
}
