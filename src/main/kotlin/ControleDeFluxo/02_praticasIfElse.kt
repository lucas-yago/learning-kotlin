package ControleDeFluxo


/*
 1  Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
    do ano. Os bônus são classificados por cargo.
        a. Gerentes recebem R$ 2.000,00
        b. Coordenadores recebem R$ 1.500,00
        c. Engenheiros de software recebem R$ 1.000,00
        d. Estagiários recebem R$ 500,00


 2   Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
        a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
        b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
        c. Engenheiros de software recebem R$ 1.000,00
        d. Estagiários recebem R$ 500,00

 3  Qual o resultado das comparações abaixo?3
        a = false b = false c = true d = true
        a). (a && b && c && d)

        a = false b = false c = true d = true
        b). (!a && !b && (c && d))

        a = false b = false c = true d = true
        c). (a && ((b || c) || d))

        a = false b = false c = true d = true
        d. (a || ((!b && c) || !d))
 */
//fun calcBonus(cargo:String): Float {
//    if (cargo == "Gerente") {
//        return 2000f
//    } else if (cargo == "Coordenador") {
//        return 1500f
//    }else if (cargo == "Engenheiros de software"){
//        return 1000f
//    }else if (cargo == "Estagiarios"){
//        return 500f
//    }else{
//        println("Cargo invalido")
//        return 0f
//    }
//}

fun calcBonus2(cargo:String, experiencia:Int): Float {
    return if (cargo == "Gerente") {
        if (experiencia < 2) 2000f else 3000f
    } else if (cargo == "Coordenador") {
        if (experiencia <1) 1500f else 1800f
    }else if (cargo == "Engenheiros de software"){
        1000f
    }else if (cargo == "Estagiarios"){
        500f
    }else{
        println("Cargo invalido")
        0f
    }
}




fun main() {
    println(calcBonus2("Gerente", 2))

    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)//false

    println(!a && !b && (c && d))//true

    println(a && ((b || c) || d))//false

    println(a || ((!b && c) || !d))//true

}