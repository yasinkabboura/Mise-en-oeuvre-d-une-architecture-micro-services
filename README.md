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


## conteneuriser ces microservices à l'aide de Docker

** **

### Customer service

* customer service dockerfile

![alt text](images/img_18.png)

* building customer service image

![alt text](images/img_19.png)

* verification d'image

![alt text](images/img_20.png)

![alt text](images/img_21.png)


### Billing service

* billing service dockerfile

![alt text](images/img_22.png)

* building billing service image

![alt text](images/img_23.png)

* verification d'image

![alt text](images/img_24.png)

![alt text](images/img_25.png)

### Eureka service

* Eureka service dockerfile

![alt text](images/img_26.png)

* building Eureka service image

![alt text](images/img_27.png)

* verification d'image

![alt text](images/img_28.png)

![alt text](images/img_29.png)


### Gateway service

* Gateway service dockerfile

![alt text](images/img_30.png)

* building Gateway service image

![alt text](images/img_31.png)

* verification d'image

![alt text](images/img_32.png)

![alt text](images/img_33.png)


## orchestrer à l'aide de Docker

** **

* run all images 

![alt text](images/img_34.png)


* Testing

![alt text](images/img_35.png)







