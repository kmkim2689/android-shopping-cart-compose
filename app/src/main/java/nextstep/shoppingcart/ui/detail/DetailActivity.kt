package nextstep.shoppingcart.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.domain.CartableProductRepository
import nextstep.shoppingcart.domain.Product
import nextstep.shoppingcart.ui.common.components.AppbarWithAction
import nextstep.shoppingcart.ui.common.components.AppbarWithNavigation
import nextstep.shoppingcart.ui.common.components.DefaultTextButton
import nextstep.shoppingcart.ui.common.components.HeadlineLargeText
import nextstep.shoppingcart.ui.common.components.HeadlineMediumText
import nextstep.shoppingcart.ui.common.components.SquareImage
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme
import nextstep.signup.R

class DetailActivity : ComponentActivity() {
    private val id: Long by lazy {
        intent?.getLongExtra(EXTRA_ID, -1L) ?: -1L
    }
    private val product: CartableProduct? by lazy {
        CartableProductRepository.fetchProduct(id)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingCartTheme {
                DetailScreen(
                    cartableProduct = product,
                    onBackClick = { finish() },
                    onCartClick = {},
                )
            }
        }
    }

    companion object {
        const val EXTRA_ID = "id"

        fun newIntent(context: Context, id: Long): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(EXTRA_ID, id)
            }
        }
    }
}

