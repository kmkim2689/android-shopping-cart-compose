package nextstep.shoppingcart.domain

data class Product(
    val id: Long,
    val name: String,
    val price: Int,
    val image: String,
) {
    companion object {
        private val products: List<Product> = listOf(
            Product(id = 1, name = "상품1", price = 10000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 2, name = "상품2", price = 20000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 3, name = "상품3", price = 30000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 4, name = "상품4", price = 40000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 5, name = "상품5", price = 50000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 6, name = "상품6", price = 60000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 7, name = "상품7", price = 70000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 8, name = "상품8", price = 80000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 9, name = "상품9", price = 90000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 10, name = "상품10", price = 100000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 11, name = "상품11", price = 110000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 12, name = "상품12", price = 120000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 13, name = "상품13", price = 130000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 14, name = "상품14", price = 140000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 15, name = "상품15", price = 150000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 16, name = "상품16", price = 160000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 17, name = "상품17", price = 170000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 18, name = "상품18", price = 180000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 19, name = "상품19", price = 190000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 20, name = "상품20", price = 200000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 21, name = "상품21", price = 210000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 22, name = "상품22", price = 220000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 23, name = "상품23", price = 230000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 24, name = "상품24", price = 240000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 25, name = "상품25", price = 250000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 26, name = "상품26", price = 260000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 27, name = "상품27", price = 270000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
            Product(id = 28, name = "상품28", price = 280000, image = "https://cdn-mart.baemin.com/sellergoods/api/main/df6d76fb-925b-40f8-9d1c-f0920c3c697a.jpg?h=700&w=700"),
            Product(id = 29, name = "상품29", price = 290000, image = "https://cdn-mart.baemin.com/sellergoods/main/52dca718-31c5-4f80-bafa-7e300d8c876a.jpg?h=700&w=700"),
            Product(id = 30, name = "상품30", price = 300000, image = "https://cdn-mart.baemin.com/sellergoods/main/e703c53e-5d01-4b20-bd33-85b5e778e73f.jpg?h=700&w=700"),
        )

        fun values(): List<Product> = products
    }
}
