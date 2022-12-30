# Spring Boot, Ports & Adapters Architecture with Kafka Producer-Consumer, Schema Registry & AVRO
Spring Boot, Ports &amp; Adapters Architecture with Kafka Producer-Consumer, Schema Registry &amp; AVRO

## Description
Refer to this DZone article [here]: [https://dzone.com/articles/ports-and-adapters-architecture-with-kafka-avro-and-spring-boot]

## Docker
To bring up the entire Kafka infrastructure, including Zookeeper, Kafka-Broker & Kafka Schema Registry, in Docker environment, cd to the directory containing docker-compose.yml and then execute the command:
```sh
docker-compose up
```

Once the Kafka infrastructure is up, we can list the topics with this command:
```sh
docker run -it --rm --name kafka_client_consumer --network kafka_network confluentinc/cp-kafka:7.0.1 /bin/kafka-topics --bootstrap-server kafka_server:29092 --list
```

Once we are done with the Kafka infrstructure, we can bring the entire environment down ny executing the following command:
```sh
docker-compose down
```

With this setup in Docker, we do NOT need any Kafka infrastructure, including Kafka Client, installed locally on our machine.






[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

[here]: <https://dzone.com/articles/ports-and-adapters-architecture-with-kafka-avro-and-spring-boot>
[https://dzone.com/articles/ports-and-adapters-architecture-with-kafka-avro-and-spring-boot]: <https://dzone.com/articles/ports-and-adapters-architecture-with-kafka-avro-and-spring-boot>
