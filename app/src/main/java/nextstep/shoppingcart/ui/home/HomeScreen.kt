package nextstep.shoppingcart.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.ui.common.components.AppbarWithAction
import nextstep.shoppingcart.ui.fixtures.cartableProductsFixture
import nextstep.shoppingcart.ui.home.components.ProductItemList
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme
import nextstep.signup.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    items: List<CartableProduct>,
    onItemClick: (Long) -> Unit,
    onCartClick: () -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            AppbarWithAction(
                title = stringResource(id = R.string.home_appbar_title),
                actionIcon = Icons.Filled.ShoppingCart,
                onActionClick = onCartClick,
            )
        },
    ) { paddingValues ->
        ProductItemList(
            modifier = Modifier,
            paddingValues = paddingValues,
            items = items,
            onItemClick = onItemClick,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    ShoppingCartTheme {
        HomeScreen(
            items = cartableProductsFixture,
            onItemClick = {},
            onCartClick = {},
        )
    }
}
