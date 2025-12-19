package com.practicum.myapplication.domain.api

import com.practicum.myapplication.data.network.Track

interface TracksRepository {
    fun searchTracks(expression: String): List<Track>
}