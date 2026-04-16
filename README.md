# 🧾 Flight Check-In Service

## 📌 Overview
The **Flight Check-In Service** is a Spring Boot-based web application responsible for handling passenger check-in operations.

It is part of a **microservice-based system**, where it communicates with the **Flight Reservation Service** to fetch reservation details and update check-in information.

This service consumes RESTful APIs using `RestTemplate` and provides a simple JSP-based UI for check-in operations.

---

## 🧩 Microservice Architecture

This service works as a consumer in a distributed system:

### ✈️ Flight Reservation Service
- Provides reservation data via REST APIs
- Manages flight bookings and passenger details

### 🧾 Flight Check-In Service (This Project)
- Consumes reservation REST APIs
- Handles passenger check-in process
- Updates reservation status (checked-in, baggage count)

---

### 🔗 Communication Flow

- REST-based service-to-service communication
- Implemented using `RestTemplate`
- Example endpoints consumed:
GET /reservations/{id}
POST /reservations

---

## 🧱 Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Web (RestTemplate)

### Frontend
- JSP
- JSTL

### Database
- No direct database access (uses Reservation Service API)

---

## 🚀 Features

### 🧾 Check-In Process
- Enter reservation ID
- Fetch reservation details from Reservation Service
- Display flight and passenger information
- Enter number of bags
- Complete check-in process

### 🔄 Reservation Integration
- Fetch reservation by ID via REST API
- Update reservation status (checked-in, baggage count)

---
```
## 📂 Project Structure
src/main/java/com/yourpackage/
│
├── controller/
│ └── CheckInController.java
│
├── client/
│ ├── ReservationRestClient.java
│ └── ReservationRestClientImpl.java
│
├── dto/
│ ├── ReservationUpdateRequestDto.java
│ └── Reservation.java
│
└── view/
├── startCheckIn.jsp
├── displayReservationDetails.jsp
└── checkInConfirmation.jsp
```

---

## 🔄 Application Flow

1. User opens check-in page  
2. Enters reservation ID  
3. System calls Reservation Service via REST API  
4. Reservation details are displayed  
5. User enters number of bags  
6. Check-in is completed  
7. Reservation is updated via REST API  

---

## 📡 REST API Communication

### 🔹 Consumed APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/reservations/{id}` | Fetch reservation details |
| POST | `/reservations` | Update reservation (check-in info) |

---

## 🧠 Key Concepts

- Microservice Communication (REST-based)
- Service Consumer pattern
- Spring RestTemplate usage
- MVC architecture with JSP
- DTO-based request handling
- Separation of concerns

---

## ⚠️ Limitations

- Uses `RestTemplate` (can be improved with Feign Client)
- Hardcoded service URL
- No API Gateway or Service Discovery
- No centralized exception handling
- Basic UI using JSP

---

## 🛠️ Future Improvements

- Replace RestTemplate with OpenFeign
- Add Eureka Service Discovery
- Introduce API Gateway (Spring Cloud Gateway)
- Add Resilience4j (retry/fallback)
- Externalize configuration (Spring Cloud Config)
- Improve UI with React/Angular
- Add authentication between services

---

## ▶️ How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/your-username/flight-checkin-service.git
   Configure application properties

2. Run the application
mvn spring-boot:run

3. Open in browser:
http://localhost:8080/showStartCheckin

🔗 Dependency

This service depends on:

👉 Flight Reservation Service
http://localhost:8080/flightReservationsystem/reservations/

👨‍💻 Author

Lokman Hossain

Java Backend Developer
