class InternationalDelivery(
    id: Int,
    origin: String,
    destination: String,
    distance: Double
) : Delivery(id, origin, destination, distance) {

    override fun getDeliveryType(): String {
        return "International delivery"
    }

    override fun track() {
        println(
            "International delivery $id: " +
                    "$origin -> $destination"
        )
    }
}