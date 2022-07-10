package ControleDeFluxo

fun main() {
    var i = 0
    do {
        print("$i ")
        i++
    } while (i == 100)

    while (i == 100) {
        print("$i ")
        i++
    }
    println("")
    // A diferença entre While e Do-While e que o Do-While executa
    // o bloco de codigo 1 vez antes de verificar a condiçao

    //EXEMPLO DE USO DO  DO-WHILE
        // no exemplo o loop solicitara o nome de usuario aque que seja enviado
        // (ate que a condiçao verdadeira se torne falsa)
    do {
        print("Qual o seu nome: ")
        val value = readLine()
    }while (value == "")
}