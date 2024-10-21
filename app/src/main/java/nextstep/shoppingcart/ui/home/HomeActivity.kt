package nextstep.shoppingcart.ui.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import nextstep.shoppingcart.domain.CartableProductRepository
import nextstep.shoppingcart.domain.CartedProductRepository
import nextstep.shoppingcart.ui.detail.DetailActivity
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingCartTheme {
                HomeScreen(
                    items = CartableProductRepository.fetchProducts(),
                    onItemClick = { id ->
                        startActivity(DetailActivity.newIntent(this, id))
                    },
                    onCartClick = {},
                )
            }
        }
    }
}



