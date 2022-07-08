fun main() {
//Unsigned
    /*
     Os tipos unsigned sao tipos de numeros inteiros
      que nao acoplam numeros negativos em seu conjunto.
     */
    println("ULong MAX - ${ULong.MAX_VALUE} / MIN - ${ULong.MIN_VALUE}")
    println("UInt MAX - ${UInt.MAX_VALUE} / MIN - ${UInt.MIN_VALUE}")
    println("UShort MAX - ${UShort.MAX_VALUE} / MIN - ${UShort.MIN_VALUE}")
    println("UByte MAX - ${UByte.MAX_VALUE} / MIN - ${UByte.MIN_VALUE}")

    val int :UInt = 0u
    //val int2 :UInt = -1u -> RETORNA ERRO
    val short :UShort = 10u
    val byte :UByte = 10u
    val long :ULong = 10u

}