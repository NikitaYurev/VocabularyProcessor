import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Vocabulary Processor") {
        MaterialTheme {
            Surface {
                Text("Hello from Compose Desktop!")
            }
        }
    }
}
