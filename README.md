## Task:
Create an application that stores data in in-memory DB and exposes some logics via REST call.
  
  Implement the following REST calls:
  1. Add a car to in-memory db (for example H2, but you are free to choose), a car
must have all of the following: make, model, year, VIN number, registration
number. You can organize field structure as it suits your needs.
  2. Get all the cars for the given make (i.e. "toyota", "audi", etc.).
  3. Export all db contents as JSON.
  4. Import db from given JSON, already existing data should be erased.
  5. Add swagger.
  6. Add unit tests.

**Non-functional requirements**: Java 11 or higher, Spring Boot as a framework, Maven as a build tool.

## Instructions

1. Open the project

2. Run -> CarApplication.

3. At this moment server is being launched and one Car table has been created in H2 database. (this table has been created automatically, script located in project src -> main -> resources -> db -> changelog -> changes.

4. Open link in browser http://localhost:8080/h2-console

5. Test connection with data below and then click Connect.

![h2 console start up](https://user-images.githubusercontent.com/94042617/170658978-da1410cb-bb32-4584-837c-0a162cf5c52c.jpg)

6. Now you can check Car table. Write this SQL statement: SELECT * FROM CAR and click RUN SELECTED.
 
![CAR](https://user-images.githubusercontent.com/94042617/171402530-20f10add-5c94-40c2-8ed2-b5109cfa12ee.jpg)

7. To check, for example, how many BMW cars there in the table as well as full information regarding specific car, use link  -> http://localhost:8080/car/search/BMW

8. To export all cars in JSON file use link  -> http://localhost:8080/car/export (right click on that page -> Save as JSON file)

9. Now you can import that file into database. For this task better to use Postman.

![import](https://user-images.githubusercontent.com/94042617/171404756-86f4a514-51fd-4b5a-a031-e3ecbb162d5c.jpg)

 - Use Post request and link http://localhost:8080/car/import
 - Go to `Body` -> `form-data` as shown in picture above and attach this file and click Send. Now all data have been imported. If you changed something in file it will update existing data or add new data if it does not exist.

10. To use Swagger UI kindly use this link -> http://localhost:8080/swagger-ui/index.html#/

11. Unit and Integration tests are located in `test` folder.
