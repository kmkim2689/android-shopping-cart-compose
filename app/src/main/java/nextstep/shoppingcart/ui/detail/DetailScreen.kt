package nextstep.shoppingcart.ui.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.domain.Product
import nextstep.shoppingcart.ui.common.components.AppbarWithNavigation
import nextstep.shoppingcart.ui.common.components.DefaultTextButton
import nextstep.shoppingcart.ui.detail.components.ProductDetail
import nextstep.shoppingcart.ui.fixtures.productsFixture
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme
import nextstep.signup.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    cartableProduct: CartableProduct?,
    onBackClick: () -> Unit,
    onCartClick: () -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            AppbarWithNavigation(
                modifier = Modifier.fillMaxWidth(),
                title = stringResource(id = R.string.detail_appbar_title),
                navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
                onNavigationClick = onBackClick
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            ProductDetail(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(paddingValues),
                cartableProduct = cartableProduct,
            )

            DefaultTextButton(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = R.string.detail_add_to_cart),
                onClick = onCartClick,
            )
        }
    }
}

@Preview
@Composable
private fun DetailScreenPreview() {
    ShoppingCartTheme {
        DetailScreen(
            cartableProduct = CartableProduct(
                id = 1,
                product = productsFixture.first(),
                quantity = 1,
            ),
            onBackClick = {},
            onCartClick = {},
        )
    }
}
