# Logistics Delivery Management System

## Project Description

Logistics Delivery Management System is a small Kotlin console application for managing shipments and demonstrating Kotlin fundamentals and object-oriented programming concepts.

The application stores information about shipments, their origins, destinations, distances, and delivery statuses. It also demonstrates shipment filtering, distance calculation, delivery tracking, inheritance, interfaces, polymorphism, and Kotlin coroutines.

## Technologies

- Kotlin
- Kotlin/JVM
- Gradle
- Kotlin Coroutines
- JDK 17

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure the project is imported as a Gradle project.
4. Wait for Gradle to download the required dependencies.
5. Open `Main.kt`.
6. Run the `main()` function.

The project uses Kotlin Coroutines, which are included through the Gradle dependency in `build.gradle.kts`.

## Main Kotlin Requirements

### Variables and Data Types

The project uses variables with different data types, including:

- `Int` for shipment IDs
- `String` for cities
- `Double` for distances
- `Boolean`-style conditions through program logic

### Conditions and Loops

`if` and `when` statements are used to check shipment information and delivery statuses.

`for` loops are used to process shipments and deliveries.

### List, Set, and Map

A `List` is used to store shipments.

A `Set` is used to store unique cities.

A `Map` is used to associate shipment IDs with destinations.

### Collection Operations

The project demonstrates:

- `map()` for extracting destinations and distances
- `filter()` for finding delayed shipments
- `reduce()` for calculating the total delivery distance

### Functions

Several functions are used to organize the program, including functions for displaying shipments, finding delayed shipments, calculating distances, and getting destinations.

### Higher-Order Functions and Lambdas

The `processShipments()` function accepts another function as a parameter:

`(Shipment) -> Unit`

Lambda expressions are used with collection operations such as `map()`, `filter()`, and `reduce()`.

### Classes and Objects

`Shipment` is a data class used to represent shipment information.

`LogisticsManager` is a Kotlin `object` used for shipment management operations.

### Inheritance

`DomesticDelivery` and `InternationalDelivery` inherit from the `Delivery` class.

### Interface

The `Trackable` interface defines the `track()` function for delivery tracking.

### Polymorphism

Different delivery types are stored in a `List<Delivery>` and provide their own implementations of the `track()` and `getDeliveryType()` functions.

### Data Class

The `Shipment` class is implemented as a Kotlin `data class`.

### Sealed Class

`DeliveryStatus` is implemented as a sealed class with three possible states:

- In Transit
- Delivered
- Delayed

### Suspend Function and Coroutine

The `trackShipment()` function is a `suspend` function.

Kotlin Coroutines are used with `launch` and `runBlocking` to demonstrate asynchronous shipment tracking.

## Project Structure

- `Main.kt` — program entry point and main application logic
- `Shipment.kt` — shipment data class
- `DeliveryStatus.kt` — sealed class for shipment statuses
- `Trackable.kt` — tracking interface
- `Delivery.kt` — base delivery class
- `DomesticDelivery.kt` — domestic delivery subclass
- `InternationalDelivery.kt` — international delivery subclass
- `LogisticsManager.kt` — logistics management object
- `TrackingService.kt` — suspend function for shipment tracking