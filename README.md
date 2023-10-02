# Student Backend Application (Java Spring Boot)

This is a backend application built using Java and the Spring Boot framework to manage student information and store it in a MySQL database. It provides two primary endpoints for adding students and retrieving a list of all students.

## Features

- Add student names and addresses to the database using a POST request.
- Retrieve a list of all students from the database using a GET request.

## Prerequisites

Before you begin, ensure you have the following tools and prerequisites:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/sachinnazare/FullStack.git
Configure the MySQL database:

Create a MySQL database for the application.
Update the database connection settings in the application.properties file located in the src/main/resources directory.
Build and run the application:

bash
Copy code
cd student-backend-app
./mvnw clean install
./mvnw spring-boot:run
The application will start, and you can access the following endpoints:

## POST /addStudent: Add a new student to the database.
## GET /getAll: Retrieve a list of all students from the database.

### API Endpoints
## Add Student (POST)
Endpoint: /add
Method: POST
Request Body:
json
{
  "name": "John Doe",
  "address": "123 Main Street"
}
Response: Returns the newly created student with an assigned ID.
## Get All Students (GET)
Endpoint: /getAll
Method: GET
Response: Returns a list of all students in the database.

## Usage
Use the /addStudent endpoint to add a new student to the database by sending a POST request with the student's name and address in the request body.
Use the /getAll endpoint to retrieve a list of all students by sending a GET request.

## Contributing
Feel free to contribute to this project by submitting issues or pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

In this `README.md` file, you have provided clear instructions for setting up, running, and using the application, with a focus on the two specified endpoints. Replace the placeholders with actual details specific to your project, such as your repository URL, database configuration, and any additional information or customization required for your application.


