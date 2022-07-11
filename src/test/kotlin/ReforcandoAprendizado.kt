import org.junit.jupiter.api.*

class ReforcandoAprendizado {

    @Test
    fun testePortaria() {
        Assertions.assertAll(
            { Assertions.assertEquals("Welcome.", portaria(20, "COMUM", "XT072022comum")) },
            { Assertions.assertEquals("Welcome.", portaria(20, "PREMIUM", "XL072022premium")) },
            { Assertions.assertEquals("Welcome.", portaria(20, "LUXO", "XL072022luxo")) },

            { Assertions.assertEquals("Negado.", portaria(20, "comum", "XR072022comum")) },
            { Assertions.assertEquals("Negado.", portaria(20, "premium", "XM072022premium")) },
            { Assertions.assertEquals("Negado.", portaria(20, "luxo", "XP072022luxo")) },
            { Assertions.assertEquals("Negado.", portaria(20, "luxo", "")) },

            { Assertions.assertEquals("Negado.", portaria(20, "especial", "Xt072022especial")) },
            { Assertions.assertEquals("Negado.", portaria(18, "", "XT072022comum")) },
            { Assertions.assertEquals("Negado.", portaria(17, "comum", "Xt072022especial")) },
        )
    }

}