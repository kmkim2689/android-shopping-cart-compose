package nextstep.shoppingcart.ui.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.domain.Product
import nextstep.shoppingcart.ui.common.components.BodyMediumText
import nextstep.shoppingcart.ui.common.components.HeadlineSmallText
import nextstep.shoppingcart.ui.common.components.SquareImage
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme
import nextstep.signup.R

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    cartableProduct: CartableProduct,
    onClick: (Long) -> Unit,
) {
    Column(
        modifier = modifier
            .clickable { onClick(cartableProduct.id) },
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        SquareImage(modifier = Modifier.fillMaxWidth(), model = cartableProduct.product.image)

        ProductItemDescription(modifier = Modifier.fillMaxWidth(), cartableProduct.product)
    }
}

@Composable
private fun ProductItemDescription(
    modifier: Modifier = Modifier,
    product: Product,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        HeadlineSmallText(text = product.name, maxLines = 1)

        BodyMediumText(
            text = stringResource(id = R.string.common_format_price, product.price),
            maxLines = 1,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ShoppingCartTheme {
        ProductItem(
            modifier = Modifier.fillMaxWidth(),
            cartableProduct = CartableProduct(
                id = 1,
                quantity = 1,
                product = Product(
                    id = 1,
                    name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                    price = 10000,
                    image = "",
                )
            ),
            onClick = {},
        )
    }
}
