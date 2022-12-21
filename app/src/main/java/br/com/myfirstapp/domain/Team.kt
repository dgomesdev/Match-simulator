package br.com.myfirstapp.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team (
    val name: String,
    @SerializedName("force")
    val stars: Int,
    val image: String,
    var score: Int?
        ) : Parcelable