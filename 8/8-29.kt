fun findMaxMin(numbers: List<Int>): Pair<Int, Int> {
    return numbers.maxOrNull() ?: 0 to numbers.minOrNull() ?: 0
}