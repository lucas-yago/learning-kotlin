package ControleDeFluxo

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de Idade")
        if (idade > 60) {
            println("Terceira idade")
        }
    } else if (idade < 10) {
        println("Criança")
    } else {
        println("Menor de idade")
    }
}

fun bomDia(dia: Boolean) = if (dia) "Bom Dia" else "Boa Noite"


fun main() {
    maiorDeIdade(65)
    maiorDeIdade(19)
    maiorDeIdade(15)
    maiorDeIdade(7)

    println(bomDia(true))
    println(bomDia(false))
}