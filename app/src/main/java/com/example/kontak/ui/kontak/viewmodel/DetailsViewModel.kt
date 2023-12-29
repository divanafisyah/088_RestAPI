package com.example.kontak.ui.kontak.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.kontak.Repositori.KontakRepositori
import com.example.kontak.model.Kontak

sealed class DetailsKontakUiState{
    data class Success(
        val kontak: Kontak
    ): DetailsKontakUiState()

    object Error : DetailsKontakUiState()
    object Loading : DetailsKontakUiState()
}

class DetailsViewModel (
    savedStateHandle: SavedStateHandle,
    private val kontakRepository: KontakRepositori
) : ViewModel()
