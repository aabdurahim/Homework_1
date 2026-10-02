class DomesticDelivery(
    id: Int,
    origin: String,
    destination: String,
    distance: Double
) : Delivery(id, origin, destination, distance) {

    override fun getDeliveryType(): String {
        return "Domestic delivery"
    }

    override fun track() {
        println(
            "Domestic delivery $id: " +
                    "$origin -> $destination"
        )
    }
}