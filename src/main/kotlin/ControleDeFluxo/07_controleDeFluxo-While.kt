package ControleDeFluxo

fun main() {

     var i = 0
     while (i < 10){
          print("$i ")
          i++
     }
     println()
     /*
     usar um true como argumento ira fazer o while rodar ate travar o computador
     se possivel nunca usar o while com esse tipo de declaraçao, sempre use uma condiçao.
          ||||
          vvvv
     while (true){
          print("Ola")
     }
      */

     //realizando contagem decrecente com o while
     var j = 10
     while (j > 0){
          print("$j ")
          j--
     }
     println()

     //iterando uma string com while
     val txt = "Kotlin"
     var s = 0
     while (s < txt.length){
          println("| ${txt[s]} |")
          s++
     }
}