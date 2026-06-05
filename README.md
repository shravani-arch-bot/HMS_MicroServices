# HMS Microservices - Hospital Management System

A Hospital Management System built using Spring Boot Microservices architecture with service discovery, API Gateway, JWT authentication, Docker, and MySQL.

## Features

- Patient Management
- Appointment Booking
- Billing Management
- JWT Authentication
- Role-Based Authorization
- API Gateway Routing
- Eureka Service Discovery
- Inter-Service Communication
- Dockerized Microservices
- Docker Compose Support

## Tech Stack

- Java 17
- Spring Boot
- Spring Security
- Spring Cloud Gateway
- Eureka Server
- JWT
- REST APIs
- MySQL
- JPA / Hibernate
- Maven
- Docker
- Docker Compose

## Services

| Service | Port |
|----------|------|
| Eureka Server | 8761 |
| API Gateway | 9090 |
| Patient Service | 8080 |
| Appointment Service | 8082 |
| Billing Service | 8083 |
| Auth Service | 8084 |

## Architecture


Client / Postman
        │
        ▼
API Gateway (9090)
        │
        ▼
Eureka Server (8761)
        │
 ┌──────┼───────────────┐
 │      │       │       │
 ▼      ▼       ▼       ▼

Patient Service      (8080)
Appointment Service  (8082)
Billing Service      (8083)
Auth Service         (8084)
```

## Security

- JWT-based Authentication
- Protected API Endpoints
- Role-Based Access Control
- ADMIN access for Billing APIs
- PATIENT access for Appointment APIs

## Run with Docker Compose

```bash
docker compose up -d
```

Stop all services:

```bash
docker compose down
```

## API Testing

Access services through API Gateway:

```text
http://localhost:9090/patients
http://localhost:9090/appointments
http://localhost:9090/bills
http://localhost:9090/auth
```

## Future Enhancements

- React Frontend Integration
- OpenFeign Communication
- CI/CD Pipeline
- Cloud Deployment
- Swagger Documentation
- Monitoring & Logging

## Author

**Shravani Kulte**