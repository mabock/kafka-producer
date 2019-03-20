package com.akelius.transaction.offerintegrationhelper.offer

import com.akelius.transaction.offerintegrationhelper.offer.model.OfferEvent
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController(
        val producer: OfferProducer,
        private val eventStore: EventStore
) {
    @PostMapping("events")
    fun postClicks() {
        producer.sendNewOfferEventToKafkaTopic()
    }

    @GetMapping("events")
    fun getClicks(): MutableList<OfferEvent> {
        return eventStore.events
    }
}


@Component
class EventStore() {
    val events: MutableList<OfferEvent> = mutableListOf()
}