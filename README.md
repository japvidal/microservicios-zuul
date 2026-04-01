# microservicios-zuul

`microservicios-zuul` is the API gateway of the Tikitakas backend. Although the repository name still references Zuul, the current implementation is based on Spring Cloud Gateway and acts as the single public entry point for the backend microservices. It routes external requests to the correct service, centralizes CORS handling, and aggregates Swagger/OpenAPI documentation from the different futfem domains.

The project is built with Java 21, Spring Boot, Spring Cloud Gateway, Eureka Client, Springdoc OpenAPI, and Maven Wrapper. It discovers the available services through Eureka and exposes a set of gateway routes such as `/api/futfem/competitions/**`, `/api/futfem/players/**`, `/api/futfem/teams/**`, and many others. This keeps the frontend simple and prevents it from needing to know each internal service address.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Default port:

- `8090`

In `v0.1.0`, this gateway also includes local CORS support for the frontend and a multi-service Swagger UI wired to the backend microservices. If something works directly in a service but not from the browser, this repository is often the right place to inspect first.
