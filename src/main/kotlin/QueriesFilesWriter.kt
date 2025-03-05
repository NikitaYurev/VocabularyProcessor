import java.io.File

class QueriesFileWriter {
    fun appendLine(file: File, lineNumber: Int, content: String) {
        if(!file.exists()) {
            file.createNewFile()
        }
        file.appendText("$lineNumber) $content\n")
    }
}