package control

import business.InviteBusiness
import entity.Convidado

class Portaria {

    private val inviteBusiness = InviteBusiness()

    init {
        println(control())
    }

    private fun control(): String {
        val age = Console.readInt("Digite a sua idade: ")
        val guest = Convidado(age = age)

        if (!inviteBusiness.validAge(guest.age)) {
            return "Negado. Menores de idade não são permitidos."
        }

        guest.type = Console.readString("Digite a seu tipo de convite: ")
        if (!inviteBusiness.validType(guest.type)) {
            return "Negado. Convite inválido."
        }

        guest.code = Console.readString("Digite a seu codigo de convite: ")
        if (!inviteBusiness.validCode(guest)) {
            return "Negado. Convite inválido."
        }

        return "Welcome :)"


    }
}
