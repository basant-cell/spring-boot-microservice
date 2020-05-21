# Project Title

This Project contains how to create microservice using feign,ribbon,zuul,eureka,spring cloud slueth and zipkin
feign for client interaction
ribbon for clientside load balancing
eureka for server management
zuul for providing uniqe id for a given requests
zipkin is used as zar for log tracing

## Getting Started

Deploye all the project starting from 
install erlang
install rabbit mq
netflix-eureka-naming-server
Verify if server is up by:http://localhost:8761/
netflix-zuul-api-gateway-server
currency-exchange-service
http://localhost:8000/h2-console/login.jsp
http://localhost:8000/currency-exchange/from/EUR/to/INR
currency-conversion-service
http://localhost:8100/currency-converter/from/EUR/to/INR/quantity/10000
ZipkinServer
run the jar
-jar zipkin-server-2.5.2-exec.jar
http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR
http://localhost:8765/currency-conversion-service/currency-converter/from/EUR/to/INR/quantity/10000

### Prerequisites

java 8 from oracle

### Installing

A step by step series of examples that tell you how to get a development env running


## Running the tests

http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR
http://localhost:8765/currency-conversion-service/currency-converter/from/EUR/to/INR/quantity/10000

### Break down into end to end tests


### And coding style tests

## Deployment

Add additional notes about how to deploy this on a live system

## Built With


## Contributing

## Versioning



## Authors

* **Basanta Kumar Sahu** - *Initial work* - [Microservice]

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
