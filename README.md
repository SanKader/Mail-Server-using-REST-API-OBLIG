# Mail-Server-using-REST-API
Assignment

This project is a Spring Boot application that provides a restful Mail Server API. It allows managing users and sending, receiving, and deleting emails. The application uses PostgreSQL as the database for storing user and email data.

## Requirements

- Java JDK 20 or above
- Maven (for project management and build)
- PostgreSQL (database server)
- An IDE such as IntelliJ IDEA for development)

## Database Configuration

1. Clone this repository and open it

2. Create a new PostgreSQL database for the application like "mailserverdb"

3. Update the `application.properties` file in your Spring Boot application to include the connection details for your PostgreSQL database. Here is an example configuration:

    ```properties
    spring.datasource.url= jdbc:postgresql://localhost:5432/mailserverdb
    spring.datasource.username= database_username
    spring.datasource.password= database_password
    
    spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
    spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect
    
    Hibernate ddl auto (create, create-drop, validate, update)
    spring.jpa.hibernate.ddl-auto= update
    ```

    Make sure to replace `your_database_username` and `your_database_password` with your actual database username and password.

   Then open pom.xml and add these dependencies:

        <dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
    
        <dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        	<scope>runtime</scope>
        </dependency>

    After you have added your dependencies you can run the program and the tables will be created in your database, enter in http://localhost:8080/swagger-ui/index.html and test out the API

