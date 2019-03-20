package com.akelius.transaction.offerintegrationhelper.offer.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

import java.time.LocalDateTime
import java.util.UUID

@Data
@AllArgsConstructor
@NoArgsConstructor
data class OfferTransaction (
        var offerId: UUID?=null,
        var decisionAt: String?=null,
        var portfolioName: String?=null,
        var assignedToOffice: Office?=null,
        var properties: List<OfferProperty>?=null
)
