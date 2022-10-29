# Mise en oeuvre d'une architecture micro-services

## Customer Microservice

** **
&#8594; Structure de project

![alt text](images/img.png)

&#8594; Swagger API


![alt text](images/img_1.png)

&#8594; test each API

* get all customers

![alt text](images/img_2.png)

* add customer

![alt text](images/img_3.png)

* get customer by ID

![alt text](images/img_4.png)

## Billing Microservice

** **
&#8594; Structure de project

![alt text](images/img_5.png)

&#8594; Swagger API


![alt text](images/img_6.png)

&#8594; test each API

* get all invoices

![alt text](images/img_7.png)

* add invoice to specific customer

![alt text](images/img_8.png)

* get invoices for a customer by customerID

![alt text](images/img_9.png)

* get invoice by ID

![alt text](images/img_10.png)

## Eureka Discovery service

** **
&#8594; Eureka configuration

![alt text](images/img_11.png)

&#8594; Customer and billing microservices are registerd with Eureka


![alt text](images/img_12.png)

* Billing service configuration


![alt text](images/img_13.png)


* Customer service configuration


![alt text](images/img_14.png)


## Spring cloud gateway 

** **
&#8594; gateway configuration

![alt text](images/img_15.png)

* gateway is registered with Eureka

![alt text](images/img_16.png)

&#8594; Gateway test

![alt text](images/img_17.png)


