# README

Basically building a spring-boot application from scratch based on some resources.

## Execution

- `./gradlew test` - compile and run all existing tests
- `./gradlew bootRun` - start the spring boot application

## Endpoints

- GET `/simple/test` -> static resonse
- GET `/simple/hello/{name}` -> dyanmic response with path variable
- POST `/simple/setProfile` -> dumps "Porfile" JSON to STDOUT
```javascript
fetch('http://localhost:8080/simple/setProfile', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({name: "Bob", address: "NYC, NY" })
})
.then(response => response?.json() || '200/OK' )
.then(data => console.log(data))
.catch(error => console.error(error));
```
  - later, changed port from 8080 -> 9090


## Inspiration /. Resources

- [What is Spring-Boot Framework?](https://www.youtube.com/watch?v=LSEYdU8Dp9Y) 5 min youtube "from scratch"
  - barest `build.gradle`, SimpleMain.java,
- Marco Codes [Hibernate & JPA Tutorial](https://www.youtube.com/watch?v=xHminZ9Dxm4)