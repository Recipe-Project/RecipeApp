package com.recipe.android.recipeapp.src.scrapRecipe.youtubeScrap.models


import com.google.gson.annotations.SerializedName

data class YoutubeScrap(
    @SerializedName("channelName")
    val channelName: String,
    @SerializedName("heartCount")
    val heartCount: Int,
    @SerializedName("postDate")
    val postDate: String,
    @SerializedName("thumbnail")
    val thumbnail: String?,
    @SerializedName("title")
    val title: String,
    @SerializedName("userIdx")
    val userIdx: Int,
    @SerializedName("youtubeId")
    val youtubeId: String,
    @SerializedName("youtubeUrl")
    val youtubeUrl: String,
    @SerializedName("playTime")
    val playTime: String
)