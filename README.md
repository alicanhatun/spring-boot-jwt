### **Spring Boot JWT Sample**

*  POST http://localhost:8080/login
    {
      "username": "alicanhatun",
      "password": "admin123"
    }

* GET http://localhost:8080/message
    * Authorization: Bearer <Given token>
