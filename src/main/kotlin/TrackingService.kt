import kotlinx.coroutines.delay

suspend fun trackShipment(shipment: Shipment) {

    println(
        "Starting tracking for shipment ${shipment.id}..."
    )

    delay(1000)

    println(
        "Shipment ${shipment.id} is being tracked: " +
                "${shipment.origin} -> ${shipment.destination}"
    )
}