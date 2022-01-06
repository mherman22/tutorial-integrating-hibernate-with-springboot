___
# tutorial-integrating-hibernate-with-springboot

This serves for learning purposes as i try to understand how [spring boot](https://spring.io/projects/spring-boot) and [hibernate](https://hibernate.org/) work together.

I used [H2](https://www.h2database.com/) in-memory database for that purpose.

## Dependencies/tools used
- `spring boot jpa`
- `hibernate`
- `h2`
- `maven`

## Initializer
The beauty with spring boot is that it comes to simplify configuration of apps hence giving the developer much more time to concentrate onto the business logic. This can be achieved by using the [spring initializer](https://start.spring.io/)

## Running the application

- **Clone the application**
  
  `https://github.com/mherman22/tutorial-integrating-hibernate-with-springboot.git`

- **Run the app**

   - You can run the spring boot app by typing the following command -
   `mvn spring-boot:run`

   - You can also package the application in the form of a jar file and then run it like so -
   `mvn package`

- The server will start on port 8090 as configured in the `application.properties`.
