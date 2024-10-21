package nextstep.shoppingcart.domain

object CartableProductRepository {
    private var products: List<CartableProduct> = Product.values().map {
        CartableProduct(id = it.id, product = it, quantity = 0)
    }

    fun fetchProducts(): List<CartableProduct> = products

    fun fetchProduct(id: Long): CartableProduct? = products.find { it.id == id }

    fun addQuantity(product: CartableProduct) {
        products = products.map {
            if (it.id == product.id) {
                if (it.quantity >= 1) {
                    CartedProductRepository.addProduct(
                        CartedProduct(
                            id = it.id,
                            product = it.product,
                            quantity = it.quantity,
                        )
                    )
                }
                it.copy(quantity = it.quantity + 1)
            } else {
                it
            }
        }
    }

    fun reduceQuantity(product: CartableProduct) {
        products = products.map {
            if (it.id == product.id) {
                if (it.quantity <= 0) {
                    CartedProductRepository.removeProduct(it.id)
                }
                it.copy(quantity = it.quantity - 1)
            } else {
                it
            }
        }
    }
}
