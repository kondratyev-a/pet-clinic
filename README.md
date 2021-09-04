# Spring Pet Clinic
The Spring Pet clinic is a sample application designed to show how the Spring stack can be used to build simple, but powerful database-oriented applications.
Part of the course [Spring Framework 5: Beginner to Guru](https://www.udemy.com/course/spring-framework-5-beginner-to-guru/).
My personal implementation of the famous [Spring Pet Clinic](https://github.com/spring-projects/spring-petclinic) project.
I used web templates from the original project for a nice appearance.

**CircleCI** automatically runs tests after each commit. The current status is [![kondratyev-a](https://circleci.com/gh/kondratyev-a/pet-clinic.svg?style=svg)](https://circleci.com/gh/kondratyev-a/pet-clinic)

You can simply [run the last version of application](https://spring5-pet-clinic.herokuapp.com/) published on Heroku.

## Application features
- Store lists of Pets, Owners, and Vets in the database
- Plan Visits of Owners to the clinic
- Display this data in a browser
- Ability to run the application in any environment
![Application screenshot](images/petclinic.png)

## Running the application locally
Requirements
- Java 11
- Maven

To build and run the application use:
```console
git clone https://github.com/kondratyev-a/spring5-pet-clinic.git  
cd spring5-pet-clinic
./mvnw spring-boot:build-image
run -p 8080:8080 spring5-pet-clinic:0.0.3-SNAPSHOT
```

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately:
```console
./mvnw spring-boot:run
```

And one more option is to create a Docker image. You'll need a Docker installed on your computer.
```console
./mvnw spring-boot:build-image
run -p 8080:8080 spring5-pet-clinic:0.0.3-SNAPSHOT
```

You can then access the application here: http://localhost:8080/

## Used technologies
- **Java 11** as the main programming language
- **Spring Boot** to simplify initial setup and use different profiles
- **Spring Web** to implement Model-View-Controller architecture
- **Spring Data JPA** to easily implement JPA based repositories
- **Hibernate** to map Java POJO's to database tables
- **H2 Database** to store data in-memory
- **Maven** to manage dependencies for builds
- **Thymeleaf** to build dynamic pages using templates written in HTML
- **Bootstrap 5** for HTML, CSS and JS templates
- **Lombok** to reduce boilerplate code
- **JUnit 5** and **Mockito** for unit and integration tests
- **Profiles** for using different data services and for i18n
- **Multi-module** Maven project to separate web and data levels
- **Wro4j** plugin to reduce web application page loading time