package com.practicum.myapplication.domain.api

import com.practicum.myapplication.data.network.Track

interface TrackSearchInteractor {
    fun searchTracks(expression: String): List<Track>
}