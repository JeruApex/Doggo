package com.example.doggo.network

import com.squareup.moshi.Json

data class DogImage(
    @Json(name = "message") val imgSrcUrl: String
)