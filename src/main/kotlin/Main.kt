import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val shipments = listOf(
        Shipment(
            id = 1,
            origin = "Almaty",
            destination = "Astana",
            distance = 1200.0,
            status = DeliveryStatus.InTransit
        ),
        Shipment(
            id = 2,
            origin = "Astana",
            destination = "Shymkent",
            distance = 1500.0,
            status = DeliveryStatus.Delivered
        ),
        Shipment(
            id = 3,
            origin = "Almaty",
            destination = "Aktobe",
            distance = 1800.0,
            status = DeliveryStatus.Delayed
        )
    )

    println("=== LOGISTICS DELIVERY MANAGEMENT SYSTEM ===")
    println()

    println("All Shipments:")

    processShipments(shipments) {
        showShipment(it)
    }

    println()

    showDelayedShipments(shipments)

    println()

    val destinations = getDestinations(shipments)

    println("Destinations:")
    println(destinations)

    println()

    val totalDistance = calculateTotalDistance(shipments)

    println("Total delivery distance: $totalDistance km")

    println()

    val cities = shipments
        .flatMap {
            listOf(it.origin, it.destination)
        }
        .toSet()

    println("All unique cities:")
    println(cities)

    println()

    val shipmentMap = shipments.associate {
        it.id to it.destination
    }

    println("Shipment Map:")
    println(shipmentMap)

    println()

    val deliveries: List<Delivery> = listOf(
        DomesticDelivery(
            id = 101,
            origin = "Almaty",
            destination = "Astana",
            distance = 1200.0
        ),
        InternationalDelivery(
            id = 102,
            origin = "Almaty",
            destination = "Urumqi",
            distance = 1000.0
        )
    )

    println("Delivery Types:")

    for (delivery in deliveries) {
        println(
            "ID: ${delivery.id} - " +
                    delivery.getDeliveryType()
        )
    }

    println()

    println("Tracking Deliveries:")

    for (delivery in deliveries) {
        delivery.track()
    }

    println()

    LogisticsManager.printSummary(shipments)

    println()

    val foundShipment = LogisticsManager.findShipmentById(
        shipments,
        2
    )

    if (foundShipment != null) {
        println(
            "Shipment found: " +
                    "${foundShipment.origin} -> " +
                    foundShipment.destination
        )
    } else {
        println("Shipment not found.")
    }

    println()

    println("Asynchronous Shipment Tracking:")

    for (shipment in shipments) {
        launch {
            trackShipment(shipment)
        }
    }
}


fun processShipments(
    shipments: List<Shipment>,
    action: (Shipment) -> Unit
) {
    for (shipment in shipments) {
        action(shipment)
    }
}


fun showDelayedShipments(
    shipments: List<Shipment>
) {
    val delayedShipments = shipments.filter {
        it.status == DeliveryStatus.Delayed
    }

    println("Delayed Shipments:")

    for (shipment in delayedShipments) {
        showShipment(shipment)
    }
}


fun calculateTotalDistance(
    shipments: List<Shipment>
): Double {
    return shipments
        .map { it.distance }
        .reduce { total, distance ->
            total + distance
        }
}


fun getDestinations(
    shipments: List<Shipment>
): List<String> {
    return shipments.map {
        it.destination
    }
}


fun showShipment(
    shipment: Shipment
) {
    println(
        "ID: ${shipment.id} | " +
                "From: ${shipment.origin} | " +
                "To: ${shipment.destination} | " +
                "Distance: ${shipment.distance} km"
    )
}