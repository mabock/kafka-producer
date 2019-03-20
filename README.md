# offer-tx-helper

- start kafka docker with

```docker-compose up```

- start spring boot app in intelliJ, the app will start under port 9000
- perform POST request to `localhost:9000/events` to publish a new OfferEvent to the kafka-topic
- perform GET request to `localhost:9000/events` to read the existing OfferEvents in the topics, as they are stored in-memory