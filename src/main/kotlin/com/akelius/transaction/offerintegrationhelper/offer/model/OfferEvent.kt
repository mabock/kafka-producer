package com.akelius.transaction.offerintegrationhelper.offer.model

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.util.*

data class OfferEvent(
        var eventId: UUID? = null,
        var eventAt: String? = null,
        var eventType: String? = null,
        var eventApiVersion: String? = null,
        var eventSource: String? = null,
        var payload: OfferTransaction? = null
)
