fun main() {
    val color : Color = Color.BLUE
    val warna = when (color){
        Color.RED -> "Color is Red"
        Color.GREEN -> "Color is Green"
        Color.BLUE -> "Color is Blue"
        else -> "No Color Detected"
    }
    println(warna)
}
enum class Color (val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}