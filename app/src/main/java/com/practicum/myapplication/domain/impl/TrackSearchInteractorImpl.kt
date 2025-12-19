package com.practicum.myapplication.domain.impl

import com.practicum.myapplication.domain.api.TrackSearchInteractor
import com.practicum.myapplication.domain.api.TracksRepository
import com.practicum.myapplication.data.network.Track


class TrackSearchInteractorImpl(private val repository: TracksRepository) : TrackSearchInteractor {

    override fun searchTracks(expression: String): List<Track> {
        return repository.searchTracks(expression)
    }
}