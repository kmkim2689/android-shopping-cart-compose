package nextstep.shoppingcart.ui.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun SquareImage(
    modifier: Modifier = Modifier,
    model: Any,
    contentDescription: String? = null,
) {
    DefaultImage(
        modifier = modifier
            .aspectRatio(1f),
        model = model,
        contentDescription = contentDescription,
    )
}

@Composable
private fun DefaultImage(
    modifier: Modifier = Modifier,
    model: Any,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.Crop,
    clipToBounds: Boolean = true,
    alignment: Alignment = Alignment.Center,
    shape: Shape = RectangleShape,
    placeholder: Painter? = ColorPainter(MaterialTheme.colorScheme.secondary)
) {
    Box(
        modifier = modifier
            .background(
                color = Color.Transparent,
                shape = shape
            ),
    ) {
        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model = model,
            placeholder = placeholder,
            contentDescription = contentDescription,
            contentScale = contentScale,
            clipToBounds = clipToBounds,
            alignment = alignment,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SquareImagePreview() {
    SquareImage(
        model = "https://img.freepik.com/free-photo/adorable-portrait-pomeranian-dog_23-2151771743.jpg?t=st=1729412945~exp=1729416545~hmac=7ae54cb97b1f19441523d37c3ade3948fb2b307ee094a75862649a4665a7a89e&w=826",
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultImagePreview() {
    DefaultImage(
        modifier = Modifier
            .size(100.dp)
            .aspectRatio(1f),
        model = "https://img.freepik.com/free-photo/adorable-portrait-pomeranian-dog_23-2151771743.jpg?t=st=1729412945~exp=1729416545~hmac=7ae54cb97b1f19441523d37c3ade3948fb2b307ee094a75862649a4665a7a89e&w=826"
    )
}
