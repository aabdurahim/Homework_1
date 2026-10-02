sealed class DeliveryStatus {

    object InTransit : DeliveryStatus()

    object Delivered : DeliveryStatus()

    object Delayed : DeliveryStatus()
}