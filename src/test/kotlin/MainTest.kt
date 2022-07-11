import org.junit.jupiter.api.*

class MainTest {

    @Test
    fun testemaiorDeIdade(){
        Assertions.assertTrue(maiorDeIdade(29))
        Assertions.assertFalse(maiorDeIdade(17))

    }

    @Test
    @DisplayName("Teste Metodo countXO")
    fun testCountXO() {

        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxxooo")) },
            { Assertions.assertTrue(countXO("XXXOOO")) },
            { Assertions.assertTrue(countXO("xXxooo")) },
            { Assertions.assertFalse(countXO("asdjsASGHBhdx")) },
            { Assertions.assertFalse(countXO("OqwiIUNMgrqwi")) }
        )
    }

    @Test
    @Disabled
    fun testNaoImplementado() {
    }

    @Test
    fun testVaiFalhar() {
        fail("--->   Nao posso terminar os testes sem esse metodo   <---")
    }

    @Test
    fun testAssunption() {
        Assumptions.assumeTrue(countXO("XoxOo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun testeException() {
        assertThrows<NullPointerException> { abc() }
    }

}
