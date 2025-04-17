fun findAverage(values: IntArray): Double {
    values.size
    var result = 0.0
    for (i in 0 until values.size) {
        result += values[i]
    }
    return result / values.size
}

fun main() {
    val array = intArrayOf(5, 6, 7, 8)
    println("average of array ${array.joinToString()} is ${findAverage(array)}")
}
