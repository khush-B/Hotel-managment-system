# Hotel Management System

A Java Spring Boot coursework application exploring hotel administration with a server-rendered interface and a relational data model.

## Stack

- Java 21 and Spring Boot 3.5.7
- Spring MVC with Thymeleaf templates
- Spring Data JPA and MySQL
- Maven and Spring Boot Test

## Code structure

| Area | Repository location |
|---|---|
| Web controllers | [`controller/`](src/main/java/com/hms/hotelmanagmentsystem/controller) |
| Domain models | [`model/`](src/main/java/com/hms/hotelmanagmentsystem/model) |
| Data repositories | [`repository/`](src/main/java/com/hms/hotelmanagmentsystem/repository) |
| Services | [`services/`](src/main/java/com/hms/hotelmanagmentsystem/services) |
| UI templates | [`templates/`](src/main/resources/templates) |

The domain model contains `Booking`, `Customer`, `Room`, `RoomType`, `Invoice`, `InvoiceItem` and `User`. Existing controllers cover authentication, home and dashboard routes. These file names document the modeled areas; they do **not** establish that all hotel workflows are complete.

## Explore the implementation

- [BookingService.java](src/main/java/com/hms/hotelmanagmentsystem/services/BookingService.java)
- [BookingRepository.java](src/main/java/com/hms/hotelmanagmentsystem/repository/BookingRepository.java)
- [DashboardController.java](src/main/java/com/hms/hotelmanagmentsystem/controller/DashboardController.java)
- [dashboard.html](src/main/resources/templates/dashboard.html)

## Local setup

1. Install **JDK 21** and a compatible MySQL server.
2. Review the database settings in [`application.properties`](src/main/resources/application.properties) and configure a local database and credentials. Keep secrets out of Git.
3. Use the included Maven wrapper to run the application:

```bash
./mvnw spring-boot:run
```

On Windows PowerShell, use `./mvnw.cmd spring-boot:run`.

Run the tests with:

```bash
./mvnw test
```

**Status:** coursework / portfolio code. Setup and runtime success have not been verified in this documentation update. Database configuration and schema may need additional local setup.
