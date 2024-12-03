curl --location 'localhost:8080/product/v1/checkout' \
--header 'Content-Type: application/json' \
--data '{   
"amount":2000,
"quantity":1,
"name":"test",
"currency":"USD"
}'