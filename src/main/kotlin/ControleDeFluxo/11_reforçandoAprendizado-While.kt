package ControleDeFluxo

/*
1 - Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
    7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?

2 - FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
        a. Quando um número for divisível por 3, imprimir Buzz.
        b. Quando um número for divisível por 5, imprimir Fizz.
        c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

3 - Escreva um programa capaz de receber um texto e imprimi-lo invertido.
        Entrada: Meu nome é Julius.     Saída: .suiluJ é emon ueM

4 - Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
    retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
        “xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false
 */

fun caixaDgua() {
    var count = 0
    var litros = 0
    while (litros < 2000) {
        if (litros + 7 > 2000) break

        litros += 7
        count++
    }
    println("qtd baloes: $count, qtd litros: $litros")
}

fun fizzBuzz() {
    var i = 1
    while (i < 50 + 1) {
        if (i % 3 == 0 && i % 5 == 0) print("||$i FizzBuzz|| ")
        else if (i % 5 == 0) print("||$i Fizz|| ")
        else if (i % 3 == 0) print("||$i Buzz|| ")
        else print("$i ")
        i++
    }
}

fun inverteTexto(txt: String) {
//    println(txt.reversed()) -> usando propria funçao do kotlin
    var i = txt.length - 1
    while (i >= 0) {
        print("${txt[i]}")
        i--
    }
}

fun checkQtdCaracter(str: String) {
    val newStr = str.lowercase()
    var i = 0
    var letraO = 0
    var letraX = 0
    while (i <= newStr.length - 1) {
        if (newStr[i] == 'o') {
            letraO++
        } else if (newStr[i] == 'x') {
            letraX++
        }
        i++
    }
    println(letraO != 0 && letraX != 0 && letraO == letraX)
}

fun main() {
    caixaDgua()
    fizzBuzz()
    println()
    println("Meu nome é Julius.     ->")
    inverteTexto("Meu nome é Julius.")
    println()
    checkQtdCaracter("XxOoox")// -> true
    checkQtdCaracter("xxxxo")// -> false
    checkQtdCaracter("bdefghjij")// -> false
    checkQtdCaracter("ooooxzzzzz")// -> false
}