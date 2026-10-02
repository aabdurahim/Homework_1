object LogisticsManager {

    fun printSummary(shipments: List<Shipment>) {
        println("=== LOGISTICS SUMMARY ===")
        println("Total shipments: ${shipments.size}")

        val totalDistance = shipments
            .map { it.distance }
            .reduce { total, distance ->
                total + distance
            }

        println("Total distance: $totalDistance km")
    }

    fun findShipmentById(
        shipments: List<Shipment>,
        id: Int
    ): Shipment? {
        return shipments.find {
            it.id == id
        }
    }
}