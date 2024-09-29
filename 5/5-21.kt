import java.time.LocalDate
import java.time.YearMonth

fun main() {
    println("Введите год:")
    val year = readLine()?.toIntOrNull() ?: return
    println("Введите месяц (1-12):")
    val month = readLine()?.toIntOrNull() ?: return

    val yearMonth = YearMonth.of(year, month)
    for (day in 1..yearMonth.lengthOfMonth()) {
        println(LocalDate.of(year, month, day))
    }
}