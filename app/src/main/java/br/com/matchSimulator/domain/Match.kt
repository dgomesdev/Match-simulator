package br.com.matchSimulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match (
    @SerializedName("description")
    val matchDescription: String,
    val place: Place,
    val homeTeam: Team,
    val awayTeam: Team
) : Parcelable