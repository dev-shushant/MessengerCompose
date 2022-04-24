package com.shushant.messengercompose.model

import androidx.compose.runtime.Immutable

@Immutable
data class VideoItem(
    val id: Int,
    val mediaUrl: String,
    val thumbnail: String,
    val lastPlayedPosition: Long = 0
)