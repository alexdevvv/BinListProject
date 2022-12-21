package com.example.binlistproject.domain.models

data class UserBinInfoModel(
    var number: Number? = Number(),
    var scheme: String? = null,
    var type: String? = null,
    var brand: String? = null,
    var prepaid: Boolean? = null,
    var country: Country? = Country(),
    var bank: Bank? = Bank()
)