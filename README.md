Spring Boot 3.1.4

A Simple Spring Boot docker-compose-postgresql application

Check application properties file and docker-compose file

Spring Boot will read database credentials from docker compose file [intern this will read from docker hub - postgres image] 


![image](https://github.com/srss-pocs/springboot-docker-compose-postgresql/assets/145287517/f4c9cf7c-21b4-4f2d-85ba-e40ed231f6d0)


![image](https://github.com/srss-pocs/springboot-docker-compose-postgresql/assets/145287517/e828afae-5ac5-434d-823e-ffe6a5a75e4a)



API

http://localhost:8080/api/books

POST

{
  "id":1, 
"name":"D1"
}

http://localhost:8080/api/books
GET








