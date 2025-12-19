package com.practicum.myapplication.creator

import com.practicum.myapplication.data.network.TracksRepositoryImpl
import com.practicum.myapplication.data.network.RetrofitNetworkClient
import com.practicum.myapplication.domain.api.TrackSearchInteractor
import com.practicum.myapplication.domain.api.TracksRepository
import com.practicum.myapplication.domain.impl.TrackSearchInteractorImpl

object Creator {
    fun getTracksRepository(): TracksRepository {
        return TracksRepositoryImpl(RetrofitNetworkClient(Storage()))
    }

    fun provideTrackSearchInteractor(): TrackSearchInteractor {
        return TrackSearchInteractorImpl(getTracksRepository())
    }
}