package ControleDeFluxo

fun main() {
    var i = 0
    while (i < 10){
        if (i == 5) {
            break
        }
        print("$i ")
        i++
    }
    println("")

    var j = 0
    while (j <10 +1){
        if (j%2 != 0){
            j++
            continue
        }
        print("$j ")
        j++
    }
}