import java.io.File

class ImageFileEnumerator {
    fun enumerateImages(folderPath: String): List<File> {
        return File(folderPath).listFiles { _, name ->
            name.endsWith(".jpg", ignoreCase = true)
        }?.sortedBy {
            it.nameWithoutExtension.toIntOrNull() ?: 0
        }?: emptyList()
    }
}