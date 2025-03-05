import java.io.File
import kotlin.test.assertEquals
import kotlin.test.Test

class ImageFileEnumeratorTest {

    @Test
    fun testEnumerateImagesInOrder() {
        // Suppose we create a temporary test directory or mock
        val testDir = File("src/test/resources/testImages")
        testDir.mkdirs()

        File(testDir, "27.jpg").createNewFile()
        File(testDir, "28.jpg").createNewFile()
        File(testDir, "29.jpg").createNewFile()

        val enumerator = ImageFileEnumerator()
        val imageFiles = enumerator.enumerateImages(testDir.path)

        assertEquals(listOf("27.jpg", "28.jpg", "29.jpg"), imageFiles.map { it.name })
    }
}