fun main() {
    // +, -, *, /, %
    var idade = 30
    idade += 1  // -> Soma
    idade -= 1  // -> Subtraçao
    idade *= 1  // -> Multiplicaçao
    idade /= 1  // -> Divisao
    idade % 1   // -> Resto da divisao

    //forma de incrementar ou decrementar de 1 em 1

    idade++ / idade-- // -> O compilador usa primeiro e incrementa depois
    ++idade / --idade // -> O compilador incrementa primeiro e usa depois

    println(++idade)
    //println(idade++)

    println(idade)
}