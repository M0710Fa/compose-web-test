
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text

@Composable
fun listScreen(list: List<String>){
    list.forEach{
        Img(
            src = "https://photo-room.net/wp-content/uploads/pr00452.jpg",
            attrs = {
                style {
                    width(100.px)
                }
            }
        )
        Li {
            Text(it)
        }
    }
}