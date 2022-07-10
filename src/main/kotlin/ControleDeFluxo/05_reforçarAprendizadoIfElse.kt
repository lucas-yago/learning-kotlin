package ControleDeFluxo

/*
1 - Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).

2 - Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).

3 - Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
    fun qualASaida(num: Int) {
        if (num >= 0) {
            if (num == 0)
                println("Primeira string")
        else println("Segunda string")
        }
        println("Terceira string")
    }

4 - Escreva um programa para ser usado na de portaria de um evento.
    a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
    permitidos.”.
    b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
    destes. Mensagem: “Negado. Convite inválido.”.
    c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
    Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
    d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
 */

fun quadrado() {
    val lado1 = readLine()?.toInt()
    val lado2 = readLine()?.toInt()
    if (lado1 != null && lado2 != null) {
        if (lado1 == lado2) {
            println("E quadrado")
        } else {
            println("Nao e quadrado")
        }
    }
}

fun triangulo() {
    val ladoa = readLine()?.toInt()
    val ladob = readLine()?.toInt()
    val ladoc = readLine()?.toInt()

    if (ladoa != null && ladob != null && ladoc != null) {
        if (ladoa == ladob && ladoa == ladoc) {
            println("E um triangulo equilatero")
        } else {
            println("Nao e um triangulo equilatero")
        }
    }
}

//R: A saida do  codigo caso seja informado o valor 4 sera => "Segunda string" "Terceira string"
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun portaria() {

    print("Digite sua idade: ")
    val idade = readLine()?.toInt()


    if (idade != null) {
        if (idade < 18) {
            println("Negado. Menores de idade não são permitidos.")
        } else {
            print("Digite seu tipo de convite: ")
            val tipoConvite = readLine()?.lowercase()

            if (tipoConvite != null && tipoConvite != "") {
                if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {

                    print("Digite seu codigo de convite: ")
                    val codConvite = readLine()?.lowercase()

                    if (codConvite != null && codConvite != "") {
                        if (tipoConvite == "comum" && codConvite.startsWith("xt")) {
                            println("Welcome :)")
                        } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codConvite.startsWith("xl")) {
                            println("Welcome :)")
                        } else {
                            println("Negado. Convite inválido.")
                        }
                    } else {
                        println("Negado. Convite inválido.")
                    }
                } else {
                    println("Negado. Convite inválido.")
                }
            } else {
                println("Negado. Convite inválido.")
            }
        }

    } else {
        println("idade invalida")
    }
}


fun main() {
    quadrado()
    triangulo()
    qualASaida(4)
    portaria()

}