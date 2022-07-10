package ControleDeFluxo

fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    println("")

    //realizando contagem decressente usando passo 2
    for (j in 20 downTo 10 step 2) {
        print("$j ")
    }
    println("")

    //iterando uma string
    val text = "kotlin e show"
    for (i in text){
        println("| $i |")
    }

}