package ExceçoesENullSafety

fun main() {


    /**
     * Operador Elvis :?
     * Se a parte esquerda da expressão for nulo, retorna a parte da direita.
     */

    val str: String? = null

    // Verificação padrão
    if (str == null) {
        println("NULO")
    } else {
        println(str)
    }

    println(str ?: "NULO")
    //println(str ?: null ?: "Null" ) pode ser encadeado


    // TODO Não existe operador ternário em Kotlin


    //ternario
    //exprecao ? if_true : if_false

    val idade = 17
    val str2 = if (idade >= 18) "Maior de idade" else "Menor de idade"
    println(str2)
}