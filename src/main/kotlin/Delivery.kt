open class Delivery(
    val id: Int,
    val origin: String,
    val destination: String,
    val distance: Double
) : Trackable {

    override fun track() {
        println(
            "Delivery $id is being tracked: " +
                    "$origin -> $destination"
        )
    }

    open fun getDeliveryType(): String {
        return "Standard delivery"
    }
}