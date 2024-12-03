curl --location 'localhost:8080/product/v1/checkout' \
--header 'Content-Type: application/json' \
--data '{   
"amount":2000,
"quantity":1,
"name":"test",
"currency":"USD"
}'

step 1:
create product request
amount quantity name currency
step 2: create payment response 
status message sessionId sessionUrl
step 3:
create stripe payment gateway account
step 4:
define secret key in application properties file
step 5:
implement stripe service 


