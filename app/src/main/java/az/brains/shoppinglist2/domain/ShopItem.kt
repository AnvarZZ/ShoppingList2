package az.brains.shoppinglist2.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val state: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
