package control

class Console private constructor() {

    companion object {
        fun readInt(msg: String): Int {
            var int: Int? = null
            do {
                print(msg)
                val input = readLine()

                if (input != null && input != "") {
                    int = input.toIntOrNull()

                    if (int == null || int <= 0) {
                        println("Idade invalida! ")
                    }
                } else println("Idade invalida! ")

            } while (int == null || int <= 0)
            return int
        }

        fun readString(msg: String): String {

            var string: String? = null
            do {
                print(msg)
                val input = readLine()
                if (input != null && input != "") {
                    string = input.lowercase()
                } else {
                    println("Convite invalida! ")
                }
            } while (string == null)
            return string
        }
    }


}
