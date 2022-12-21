package com.example.binlistproject.domain

import com.example.binlistproject.domain.models.UserBinInfoModel

interface Repository {
    operator fun invoke(bin: String): UserBinInfoModel
}