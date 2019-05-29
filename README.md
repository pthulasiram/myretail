# myretail
My Retail is fastest growing retail store - Demo Application using spring cloud

For more details about project and architecture

https://docs.google.com/document/d/1K-DEzHt3EWmaMldAX7zHPdFOZjFQyO7SrzMO2sqBaxI
### Pre requisites
JDK 1.8
Maven 3.x
Heroku 
###Install & deploy
git clone https://github.com/pthulasiram/myretail.git
cd myretail
mvn clean intall
heroku login
enter credentails as per scree instructions

heroku create product-api-service
mvn heroku:deploy

Repeate above instructions for all service

### Fetch product details by product id
```
curl -X GET "https://product-api-service.herokuapp.com/product/10001" -H "accept: */*"
```

Code	Details
200	
Response Body
```
{
  "id": 10001,
  "name": "IPhone 5s",
  "current_price": {
    "value": 649,
    "currency_code": "USD"
  }
}
```

### Delete product by product id

```
curl -X DELETE "https://product-api-service.herokuapp.com/product/10001" -H  "accept: */*"

```

200	
Response headers

 connection: keep-alive  content-length: 0  date: Wed, 29 May 2019 10:16:02 GMT  server: Cowboy  via: 1.1 vegur 

### create new  product

```
curl -X POST "https://product-api-service.herokuapp.com/product" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"name\": \"IPhone 5s\", \"current_price\": { \"value\": 649, \"currency_code\": \"USD\" }}"

```
Response body

```

{
  "id": 10008,
  "name": "IPhone 5s",
  "current_price": {
    "value": 649,
    "currency_code": "USD"
  }
}

```

### update product

```
curl -X PUT "https://product-api-service.herokuapp.com/product" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"id\": 10008, \"name\": \"IPhone 5s\", \"current_price\": { \"value\": 699, \"currency_code\": \"USD\" }}"
```

Response body

```

{
  "id": 10008,
  "name": "IPhone 5s",
  "current_price": {
    "value": 699,
    "currency_code": "USD"
  }
}

```

