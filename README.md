<h2>Digital Innovation: Expert class - People manager system using API REST and Spring Boot</h2>

This Springboot application can manage usual tasks that a real application normally would like adding , updating, deleting and querying elementes.

The stack consists mainly of:

* Spring Boot 2.5.4
* H2 and JPA
* Mapstruct
* Mockito
* Swagger
* Heroku free cloud service
* Java 11

To run locally:

```shell script
mvn spring-boot:run 
```

And the following endpoints will be avaliable:

```
GET:     http://localhost:8080/api/v1/person
GET:     http://localhost:8080/api/v1/person/{id}
POST:    http://localhost:8080/api/v1/person/
PUT:     http://localhost:8080/api/v1/person/{id}
DELETE:  http://localhost:8080/api/v1/person/{id}
```


The live API is avaliable at:
```
https://dio-peopleapi-spring.herokuapp.com/
```
And the Swagger docs are here:
```
https://dio-peopleapi-spring.herokuapp.com/swagger-ui/#/
```
