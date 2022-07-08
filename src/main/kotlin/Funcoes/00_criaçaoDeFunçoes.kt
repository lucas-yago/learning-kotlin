package Funcoes

fun main() {
    helloWorld()
    helloWorld2()
    println("a soma entre 10 + 5 e: ${soma(10, 5)} ")
    println("a divisao 10/2 e: ${divisao(10, 2)} ")

}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun helloWorld() {
    println("Hello World")
}
//Funçoes Single Line

fun divisao(a: Int, b: Int) = (a + b)

fun helloWorld2() = println("Hello World")