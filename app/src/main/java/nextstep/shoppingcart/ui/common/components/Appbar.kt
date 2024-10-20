package nextstep.shoppingcart.ui.common.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppbarWithAction(
    modifier: Modifier = Modifier,
    title: String,
    actionIcon: ImageVector,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onActionClick: () -> Unit,
) {
    DefaultAppbar(
        modifier = modifier,
        title = {
            TitleLargeText(
                modifier = Modifier.padding(6.dp),
                text = title,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 1,
                textAlign = TextAlign.Center,
            )
        },
        actionIcon = {
            DefaultIconButton(
                imageVector = actionIcon,
                onClick = onActionClick
            )
        },
        scrollBehavior = scrollBehavior,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppbarWithNavigation(
    modifier: Modifier = Modifier,
    title: String,
    navigationIcon: ImageVector,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onNavigationClick: () -> Unit,
) {
    DefaultAppbar(
        modifier = modifier,
        title = {
            TitleLargeText(
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp),
                text = title,
                maxLines = 1,
                textAlign = TextAlign.Start,
            )
        },
        navigationIcon = {
            DefaultIconButton(
                modifier = Modifier,
                imageVector = navigationIcon,
                onClick = onNavigationClick
            )
        },
        scrollBehavior = scrollBehavior,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultAppbar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    navigationIcon: @Composable () -> Unit = {},
    actionIcon: @Composable () -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = { title() },
        navigationIcon = { navigationIcon() },
        actions = { actionIcon() },
        scrollBehavior = scrollBehavior,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            navigationIconContentColor = MaterialTheme.colorScheme.onSurface,
            actionIconContentColor = MaterialTheme.colorScheme.onSurface,
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun AppbarWithActionPreview() {
    ShoppingCartTheme {
        AppbarWithAction(
            modifier = Modifier.fillMaxWidth(),
            title = "상품 목록",
            actionIcon = Icons.Filled.ShoppingCart,
            onActionClick = {},
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun AppbarWithNavigationPreview() {
    ShoppingCartTheme {
        AppbarWithNavigation(
            modifier = Modifier.fillMaxWidth(),
            title = "장바구니",
            navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
            onNavigationClick = {},
        )
    }
}
