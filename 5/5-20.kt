fun isPrime(number: Int): Boolean{
    if (number < 2) return false
    for (i in 2..Math.sqrt(number.toDouble()).toInt()){
        if (number % i == 0) return false
    }
    return true
}
fun main(){
    println("Введите начало диапозона:")
    val starts = readLine()?.toIntOrNull() ?:return 
    println("Введите конец диапозона:")
    val end = readLine()?.toIntOrNull()?: return

    println("Простые числа в диапозоне от $starts до $end :")
    for (i in starts..end){
        if(isPrime(i)){
            print("$i ")
        }
    }
}