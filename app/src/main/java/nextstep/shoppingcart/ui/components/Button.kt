package nextstep.shoppingcart.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme

@Composable
fun DefaultTextButton(
    modifier: Modifier = Modifier,
    text: String,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    shape: Shape = RectangleShape,
    textAlign: TextAlign = TextAlign.Center,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor,
        ),
        contentPadding = PaddingValues(vertical = 16.dp),
    ) {
        HeadlineMediumText(
            modifier = Modifier.fillMaxWidth(),
            text = text,
            textAlign = textAlign,
            color = Color.Unspecified,
        )
    }
}

@Preview
@Composable
private fun DefaultTextButtonPreview() {
    ShoppingCartTheme {
        DefaultTextButton(modifier = Modifier.fillMaxWidth(), text = "장바구니 담기", onClick = {})
    }
}
