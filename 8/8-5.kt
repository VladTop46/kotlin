fun shouldTakeRiskAgain(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}