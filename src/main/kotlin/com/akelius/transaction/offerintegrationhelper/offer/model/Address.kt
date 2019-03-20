package com.akelius.transaction.offerintegrationhelper.offer.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@AllArgsConstructor
@NoArgsConstructor
data class Address (
        var country: String? = null,
        var zipCode: String? = null,
        var postalCity: String? = null,
        var streetName: String? = null,
        var streetNumber: String? = null,
        var district: String? = null,
        var neighborhood: String? = null,
        var lat: String? = null,
        var lon: String? = null
)
