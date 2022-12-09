# Microservice Product

###Endpoints:

####Save product 

....

POST /api/product HTTP/1.1 \
Host: localhost:3333\
Authorization: Basic base64(username:password)\
Content-Type: application/json\
Content-Length: 44

{
"name": "test2",
"price": 1.3
}

....

####Get products

....

GET /api/product HTTP/1.1\
Host: localhost:3333\
Authorization: Basic base64(username:password)\

....


####Delete product


....

DELETE /api/product/1 HTTP/1.1\
Host: localhost:3333\
Authorization: Basic base64(username:password)

....