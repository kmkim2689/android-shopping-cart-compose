package nextstep.shoppingcart.domain

data class CartedProduct(
    val id: Long,
    val product: Product,
    val quantity: Int,
) {
    val totalPrice: Int = product.price * quantity

    init {
        require(quantity >= 1) { EXCEPTION_QUANTITY }
    }

    companion object {
        private const val EXCEPTION_QUANTITY =
            "carted product quantity must be greater than or equal to 1"
    }
}
