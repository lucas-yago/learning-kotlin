package ExceçoesENullSafety

fun main() {
    try {
        val str: String? = null
        println(str!!.length) //NullPointerException
        println(12 / 0) //ArithmeticException

    } catch (e: ArithmeticException) {
        println("Divisao por zero!")
    } catch (e: NullPointerException) {
        println("NullPointer!!")
    } catch (e: Exception) {
        println("Tivemos um Problema")
    } finally {
        println("finally")
    }

}