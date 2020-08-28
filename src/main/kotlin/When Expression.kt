fun main() {
    val value = 7
    val stringOfValue = when(value){
        6 -> "Value is 6"
        7 -> "Value is 7"
        8 -> "Value is 8"
        else -> "Value cannot be reached"
    }
    println(stringOfValue)
}