package nextstep.shoppingcart.domain

data class CartableProduct(
    val id: Long,
    val product: Product,
    val quantity: Int,
) {
    init {
        require(quantity >= 0) { EXCEPTION_QUANTITY }
    }

    companion object {
        private const val EXCEPTION_QUANTITY =
            "cartable product quantity must be greater than or equal to 0"
    }
}
