# Patient Service

A lightweight Java microservice for managing patient data—providing CRUD operations for patient records via RESTful APIs.

##  Tech Stack

- Java 17+  
- Spring Boot  
- Maven  
- (Optional) H2, PostgreSQL, or MySQL for persistence  
- (Optional) Docker for containerization  

##  Features

- Create, read, update, and delete patient records  
- REST API endpoints for patient management  
- Input validation and error handling  
- In-memory or persistent storage options  
- (Optional) Unit and integration tests  

##  Getting Started

### Prerequisites

- Java 17 or newer  
- Maven  
- Git

### Run Locally

```bash
git clone https://github.com/ontiverosgerman/patient-service.git
cd patient-service
mvn clean install
mvn spring-boot:run
