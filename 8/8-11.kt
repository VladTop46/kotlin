fun solveEquation(equation: String): Int {
    return equation.split("+", "-").map { it.toInt() }.sum()
}