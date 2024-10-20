package nextstep.shoppingcart.ui.common.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme

@Composable
fun TitleLargeText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
) {
    DefaultText(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.titleLarge,
        textAlign = textAlign,
        maxLines = maxLines,
        color = color
    )
}

@Composable
fun BodyLargeText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
) {
    DefaultText(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
    )
}

@Composable
fun BodyMediumText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
) {
    DefaultText(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
    )
}

@Composable
fun HeadlineLargeText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
) {
    DefaultText(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.headlineLarge,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
    )
}

@Composable
fun HeadlineMediumText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
) {
    DefaultText(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.headlineMedium,
        textAlign = textAlign,
        maxLines = maxLines,
        color = color
    )
}

@Composable
fun HeadlineSmallText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
) {
    DefaultText(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.headlineSmall,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
    )
}

@Composable
private fun DefaultText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle,
    textAlign: TextAlign? = null,
    color: Color = Color.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
) {
    Text(
        modifier = modifier,
        text = text,
        style = style,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines
    )
}

@Preview(showBackground = true)
@Composable
private fun TitleLargeTextPreview() {
    ShoppingCartTheme {
        TitleLargeText(text = "kmkim")
    }
}

@Preview(showBackground = true)
@Composable
private fun TitleMediumTextPreview() {
    ShoppingCartTheme {
        HeadlineMediumText(text = "kmkim")
    }
}

@Preview(showBackground = true)
@Composable
private fun TitleSmallTextPreview() {
    ShoppingCartTheme {
        HeadlineSmallText(text = "kmkim")
    }
}

@Preview(showBackground = true)
@Composable
private fun BodyLargeTextPreview() {
    ShoppingCartTheme {
        BodyLargeText(text = "kmkim")
    }
}

@Preview(showBackground = true)
@Composable
private fun BodyMediumTextPreview() {
    ShoppingCartTheme {
        BodyMediumText(text = "kmkim")
    }
}

@Preview(showBackground = true)
@Composable
private fun HeadlineLargeTextPreview() {
    ShoppingCartTheme {
        HeadlineLargeText(text = "kmkim")
    }
}
