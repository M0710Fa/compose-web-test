
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)
    val list = listOf(
        "aaa",
        "bbb",
        "ccc"
    )

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            listScreen(list)
        }
    }
}

