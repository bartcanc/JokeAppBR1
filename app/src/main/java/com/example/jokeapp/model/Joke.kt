package com.example.jokeapp.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true) // Moshi annotation to generate the JSON adapter for the Joke class
@Parcelize // Parcelize annotation to make the Joke class Parcelable to pass it between fragments with safe args
data class Joke(
    @Json(name = "category")
    val category: String,
    @Json(name = "delivery")
    val delivery: String?, // nullable delivery field for two-part jokes
    @Json(name = "flags")
    val flags: Flags,
    @Json(name = "id")
    val id: Int,
    @Json(name = "joke")
    val joke: String?, // nullable joke field for single-part jokes
    @Json(name = "lang")
    val lang: String,
    @Json(name = "safe")
    val safe: Boolean,
    @Json(name = "setup")
    val setup: String?, // nullable setup field for two-part jokes
    @Json(name = "type")
    val type: String
): Parcelable{
    @JsonClass(generateAdapter = true)
    @Parcelize // Parcelize annotation to make the Flags class Parcelable
    data class Flags(
        @Json(name = "explicit")
        val explicit: Boolean,
        @Json(name = "nsfw")
        val nsfw: Boolean,
        @Json(name = "political")
        val political: Boolean,
        @Json(name = "racist")
        val racist: Boolean,
        @Json(name = "religious")
        val religious: Boolean,
        @Json(name = "sexist")
        val sexist: Boolean
    ): Parcelable {}
}