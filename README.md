
===============Requirements========================

Java 11

Spring Boot 2.5.0.RELEASE

Maven version 4.0.0

MongoDB version 4.4.6

Mokito/Junit

===============Steps to run the project====================

Install mongoDb on your local machine and start the mongo server.

Create a new database myretail in mongo. Create a collection product. Use the mongo insert document queries to insert documents.

Run mvn clean install to build the project.

After a successful maven build, a jar file(productapi-0.0.1-SNAPSHOT.jar) will be generated in the target folder. Now execute the below command to run this application using springboot.

java -jar target/productapi-0.0.1-SNAPSHOT.jar

Server will start on port 8050 with context path '/api/v1' indicating first version of the API

Use postman to test the api endpoints.

==============Mongo DB database and collection details==================

database=myretail

mongodb host=localhost

mongodb port=27017

mongo collection name =product

use myretail

db.product.insert({"id":"13860428" ,"current_price":{"value":299.76,"currency_code":"USD"}})

db.product.insert({"id":"54456119" ,"current_price":{"value":29.76,"currency_code":"USD"}})

db.product.insert({"id":"13264003" ,"current_price":{"value":699.76,"currency_code":"USD"}})

db.product.insert({"id":"12954218" ,"current_price":{"value":199.76,"currency_code":"USD"}})

db.product.drop()

==============API Info========================================

GET ProductDetails

 GET localhost:8050/api/v1/products/13860428

 Response: 200OK


 {
 
    "id": "13860428",
    
    "name": "The Big Lebowski (Blu-ray)",
    
    "current_price": {
    
        "value": "99.99",
        
        "currency_code": "USD"
        
    }
    
}

Update ProductPrice

PUT localhost:8050/api/v1/products/13860428


RequestBody:

{

    "id": "13860428",
    
    "name": "The Big Lebowski (Blu-ray)",
    
    "current_price": {
    
        "value": "100.99",
        
        "currency_code": "USD"
        
    }
    
}

ResponseStatus: 200OK

ResponseBody:

{

    "id": "13860428",
    
    "name": "The Big Lebowski (Blu-ray)",
    
    "current_price": {
    
        "value": "100.49",
        
        "currency_code": "USD"
        
    }
    
}


===============Dockerize the app and useful docker commands===========================

docker build -t api-docker-image .

docker run -d -p 9090:8050 api-docker-image

docker-compose up

docker ps

docker container rm containerid

docker container kill $(docker ps -q)

================Internal Product URI======================================
https://redsky.target.com/v3/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics&key=candidate
