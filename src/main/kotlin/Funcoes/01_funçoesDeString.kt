package Funcoes

fun main(){
    val str = "Programacao Kotlin"
    println("Tamanho da string: ${str.length}")
    println("Posicao (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 5))

    println(str.replace("Kotlin", "Kotlin e Show!"))
    println(str.lowercase())
    println(str.uppercase())
    println("                 meu nome e                    ".trim())

}