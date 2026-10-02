data class Shipment(
    val id: Int,
    val origin: String,
    val destination: String,
    val distance: Double,
    val status: DeliveryStatus
)