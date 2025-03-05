package utils
import junit.framework.TestCase.assertEquals
import kotlin.test.Test
import kotlin.test.assertEquals

class WordProcessorTest {

    @Test
    fun testFormatResponse() {
        val raw = """
            ausgezeichnet,ausgezeichneter,ausgezeichnetsten,
            hübsch,hübscher,hübschsten
        """.trimIndent()

        val expected = "ausgezeichnet,ausgezeichneter,ausgezeichnetsten,hübsch,hübscher,hübschsten"

        val result = WordProcessor.formatResponse(raw)
        assertEquals(expected, result, "Formatting did not match!")
    }
}