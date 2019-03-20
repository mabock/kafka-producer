package com.akelius.transaction.offerintegrationhelper.offer.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

import java.util.UUID

@AllArgsConstructor
@NoArgsConstructor
data class OfferProperty (
        var propertyId: UUID? = null,
        var propertyName: String? = null,
        var askingPrice: Double? = null,
        var constructionYear: Int? = null,
        var plotSize: Int? = null,
        var seller: String? = null,
        var address: Address? = null,
        var apartmentUnits: Int? = null,
        var commercialUnits: Int? = null,
        var parkingUnits: Int? = null,
        var otherUnits: Int? = null,
        var totalUnits: Int? = null,
        var vacantApartmentUnits: Int? = null,
        var vacantCommercialUnits: Int? = null,
        var residentialArea: Double? = null,
        var commercialArea: Double? = null,
        var residentialIncomePerYear: Double? = null,
        var commercialIncomePerYear: Double? = null,
        var parkingIncomePerYear: Double? = null,
        var otherIncomePerYear: Double? = null,
        var totalIncomePerYear: Double? = null
)
