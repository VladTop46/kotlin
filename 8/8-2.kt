fun maxMinDifference(numbers: List<Int>): Int {
    val max = numbers.maxOrNull() ?: 0
    val min = numbers.minOrNull() ?: 0
    return max - min
}