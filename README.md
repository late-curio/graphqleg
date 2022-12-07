GraphQL Example
===============

Derived from https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/

`.gradlew bootRun`

http://localhost:8080/graphiql

```graphql
query {
    playerById(id: "will") {
        id
        name
        email
        sessionCount
        group {
            id
            name
        }
    }
}
```