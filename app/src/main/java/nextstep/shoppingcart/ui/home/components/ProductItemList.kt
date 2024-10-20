package nextstep.shoppingcart.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.ui.fixtures.cartableProductsFixture
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme

@Composable
fun ProductItemList(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    items: List<CartableProduct>,
    onItemClick: (Long) -> Unit
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            start = 18.dp,
            top = paddingValues.calculateTopPadding(),
            end = 18.dp,
            bottom = paddingValues.calculateBottomPadding(),
        ),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        items(
            items = items,
            key = { it.id },
        ) { product ->
            ProductItem(
                modifier = Modifier.fillMaxWidth(),
                cartableProduct = product,
                onClick = onItemClick,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItemListPreview() {
    ShoppingCartTheme {
        ProductItemList(
            modifier = Modifier.fillMaxSize(),
            paddingValues = PaddingValues(),
            items = cartableProductsFixture,
            onItemClick = {},
        )
    }
}
