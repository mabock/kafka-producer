package com.akelius.transaction.offerintegrationhelper.offer.model

import java.util.*

data class Office(
        var regionId: UUID? = null,
        var regionName: String? = null,
        var countryName: String? = null,
        var countryCode: String? = null
)
