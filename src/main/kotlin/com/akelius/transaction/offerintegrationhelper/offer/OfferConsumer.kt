package com.akelius.transaction.offerintegrationhelper.offer

import com.akelius.transaction.offerintegrationhelper.offer.model.OfferEvent
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import java.io.IOException

@Component
class OfferConsumer(
        val eventStore: EventStore
) {

    private val objectMapper = ObjectMapper()

    @KafkaListener(topics = ["offer-tx-topic"])
    @Throws(IOException::class)
    fun consume(message: String) {
        val event = objectMapper.readValue(message, OfferEvent::class.java)
        eventStore.events.add(event)
        println("received offer event :" + event.eventId)
    }
}
