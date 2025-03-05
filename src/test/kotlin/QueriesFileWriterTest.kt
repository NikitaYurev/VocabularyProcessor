import kotlin.test.Test
import kotlin.test.assertEquals
import java.io.File

class QueriesFileWriterTest {

    @Test
    fun testAppendQueryLines() {
        val writer = QueriesFileWriter()
        val tempOutput = File.createTempFile("testQueries", ".txt")

        // Suppose we write two lines
        writer.appendLine(tempOutput, 1, "hello,world")
        writer.appendLine(tempOutput, 2, "greetings,fellow,human")

        val contents = tempOutput.readText().trim()
        val expected = """
            1) hello,world
            2) greetings,fellow,human
        """.trimIndent()

        assertEquals(expected, contents)
    }
}