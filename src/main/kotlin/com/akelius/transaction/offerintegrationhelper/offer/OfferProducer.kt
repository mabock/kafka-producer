package com.akelius.transaction.offerintegrationhelper.offer

import com.akelius.transaction.offerintegrationhelper.offer.model.OfferEvent
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import java.util.*
import javax.annotation.PostConstruct

@Component
class OfferProducer(
        private val kafkaTemplate: KafkaTemplate<String, String>,
        private val objectMapper: ObjectMapper
){
    lateinit var fileContent: String
    val TOPIC = "offer-tx-topic"

    fun sendNewOfferEventToKafkaTopic(){
        var event = objectMapper.readValue<OfferEvent>(fileContent)
        event.eventId = UUID.randomUUID()
        kafkaTemplate.send(TOPIC, objectMapper.writeValueAsString(event))
    }

    @PostConstruct
    fun initializeDefault() {
        fileContent = this::class.java.classLoader.getResource("static/offer-event.json").readText()
    }
}