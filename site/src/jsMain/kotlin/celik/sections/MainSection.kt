package celik.sections

import androidx.compose.runtime.Composable
import celik.util.Constants.SECTION_NARROW
import celik.util.Constants.SECTION_WIDTH
import celik.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
    Box(
        modifier = Modifier
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ){
        MainBackground()
    }
    /*
    Box(
        modifier = Modifier
            .maxWidth(SECTION_NARROW.px),
        contentAlignment = Alignment.TopCenter
    ){
        LittleBackground()
    }
     */
}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.Image.background,
        desc = "Background Image"
    )
}

@Composable
fun LittleBackground() {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.Image.littleBack,
        desc = "Background Image"
    )
}
