package nextstep.shoppingcart.domain

object CartedProductRepository {
    private var products: List<CartedProduct> = emptyList()

    fun fetchProducts(): List<CartedProduct> = products

    fun addProduct(product: CartedProduct) {
        products = products.plus(product)
    }

    fun removeProduct(cartedProductId: Long) {
        products = products.filter { it.id != cartedProductId }
    }

    fun changeQuantity(product: CartedProduct, quantity: Int) {
        products = products.map {
            if (it.id == product.id) {
                it.copy(quantity = quantity)
            } else {
                it
            }
        }
    }

    fun clear() {
        products = emptyList()
    }
}
