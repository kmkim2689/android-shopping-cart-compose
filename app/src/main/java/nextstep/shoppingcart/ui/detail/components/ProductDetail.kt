package nextstep.shoppingcart.ui.detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.ui.common.components.BodyLargeText
import nextstep.shoppingcart.ui.common.components.HeadlineLargeText
import nextstep.shoppingcart.ui.common.components.SquareImage
import nextstep.shoppingcart.ui.fixtures.cartableProductsFixture
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme
import nextstep.signup.R

@Composable
fun ProductDetail(
    modifier: Modifier = Modifier,
    cartableProduct: CartableProduct?,
) {
    Column(
        modifier = modifier
    ) {
        SquareImage(
            modifier = Modifier.fillMaxWidth(),
            model = cartableProduct?.product?.image
        )

        if (cartableProduct != null) {
            ProductInformation(
                modifier = Modifier.fillMaxWidth(),
                cartableProduct = cartableProduct,
            )
        }
    }
}

@Composable
private fun ProductInformation(
    modifier: Modifier = Modifier,
    cartableProduct: CartableProduct
) {
    Column(
        modifier = modifier,
    ) {
        HeadlineLargeText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            text = cartableProduct.product.name,
            maxLines = 1,
        )

        HorizontalDivider()

        PriceInformation(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            cartableProduct = cartableProduct,
        )
    }
}

@Composable
private fun PriceInformation(
    modifier: Modifier = Modifier,
    cartableProduct: CartableProduct
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        BodyLargeText(
            modifier = Modifier.weight(1f),
            text = stringResource(R.string.detail_price)
        )

        BodyLargeText(
            modifier = Modifier
                .weight(1f),
            text = stringResource(
                R.string.common_format_price,
                cartableProduct.product.price
            ),
            textAlign = TextAlign.End
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductDetailPreview() {
    ShoppingCartTheme {
        ProductDetail(
            modifier = Modifier.fillMaxWidth(),
            cartableProduct = cartableProductsFixture.first()
        )
    }
}
