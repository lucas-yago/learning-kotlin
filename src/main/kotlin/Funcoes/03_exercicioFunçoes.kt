package Funcoes

/**
 * 1 - Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
 *  minutos e segundos. Saída desejada:
 *  2 anos equivalem a:
 *  24 meses
 *  730 dias
 *  17520 horas
 *  1051200 minutos
 *  63072000 segundos
 *
 * 2 - Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
 *
 * 3 - Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
 *
 * 4 - Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
 *
 * 5 - Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
 *      a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
 *      b. Escrever uma função para a troca de letras e impressão do valor final.
 *      c. String final deve estar com todas as letras minúsculas.
 *
 * 6 - Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
 * sim, transforme-as.
 *
 */
fun main() {
    qtdTempo(2)//1
    println(countCaracters("fox"))//2
    println(calcCube(3))//3
    println(milesInKm(100f))//4
    changeLetters("AmassAr")//5
}

fun qtdTempo(anos: Int) {
    println(
        """
        $anos anos equivalem a:
        ${anos * 12} meses
        ${anos * 365} dias
        ${anos * 8760} horas
        ${anos * 525600} minutos
        ${anos * 31536000} segundos
        """.trimIndent()
    )
}

fun countCaracters(str: String) = str.length

fun calcCube(number: Int) = (number * number * number)

fun milesInKm(miles: Float) = (miles * 1.6f)

fun changeLetters(str: String) {
    println(str.lowercase().replace("a", "x"))
}
//fun changeLetters2(str:String) = str.replace("A","x",ignoreCase = true).uppercase()

