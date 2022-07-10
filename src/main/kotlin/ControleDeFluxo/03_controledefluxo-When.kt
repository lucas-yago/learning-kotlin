package ControleDeFluxo

fun calcBonusWhen(cargo:String):Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiros de software" -> 1000f
        "Estagiarios" -> 500f
        else -> 0f
    }
}

fun main() {
   println(calcBonusWhen("Gerente"))
}