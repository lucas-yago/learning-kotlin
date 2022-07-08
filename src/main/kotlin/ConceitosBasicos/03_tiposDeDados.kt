/*
Type        Bit
Double      64
Float       32
Long        64
Int         32
Short       16
Byte        8
Boolean     ?
String      ?
Char        ?
*/

fun main() {

    val char: Char = 'a'
    val string: String = "isso e uma string"
    val boolean: Boolean = true

    val double: Double = 10.0
    val float: Float = 10f
    val long: Long = 10L
    val int: Int = 10
    val short: Short = 10
    val byte:Byte = 10

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}