package nextstep.shoppingcart.ui.fixtures

import nextstep.shoppingcart.domain.CartableProduct
import nextstep.shoppingcart.domain.Product

val cartableProductsFixture =
    listOf(
        CartableProduct(
            id = 1,
            quantity = 1,
            product = Product(
                id = 1,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 10000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 2,
            quantity = 1,
            product = Product(
                id = 2,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 20000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 3,
            quantity = 1,
            product = Product(
                id = 3,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 30000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 4,
            quantity = 1,
            product = Product(
                id = 4,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 10000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 5,
            quantity = 1,
            product = Product(
                id = 5,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 20000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 6,
            quantity = 1,
            product = Product(
                id = 6,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 30000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 7,
            quantity = 1,
            product = Product(
                id = 7,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 10000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 8,
            quantity = 1,
            product = Product(
                id = 8,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 20000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 9,
            quantity = 1,
            product = Product(
                id = 9,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 30000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 10,
            quantity = 1,
            product = Product(
                id = 10,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 10000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 11,
            quantity = 1,
            product = Product(
                id = 11,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 20000,
                image = "https://picsum.photos/200",
            )
        ),
        CartableProduct(
            id = 12,
            quantity = 1,
            product = Product(
                id = 12,
                name = "상품명한줄넘어가는수준으로길게하면어떻게될까요줄여야하는데",
                price = 30000,
                image = "https://picsum.photos/200",
            )
        ),
    )

val productsFixture = cartableProductsFixture.map { it.product }
