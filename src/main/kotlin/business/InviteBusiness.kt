package business
import entity.Convidado

class InviteBusiness {

    fun validAge (age: Int) = (age >= 18)

    fun validType(type: String) = (type == "comum" || type == "premium" || type == "luxo")

    fun validCode(invite: Convidado): Boolean {
        return when (invite.type) {
            "comum" -> invite.code.startsWith("xt")
            "premium", "luxo" -> invite.code.startsWith("xl")
            else -> false
        }
    }
}