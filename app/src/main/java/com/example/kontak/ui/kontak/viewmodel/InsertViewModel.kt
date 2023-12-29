package com.example.kontak.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.kontak.Repositori.KontakRepositori

class InsertViewModel (private val kontakRepository: KontakRepositori) : ViewModel() {

    var insertKontakState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertKontakState(insertUiEvent : InsertUiEvent) {
        insertKontakState = InsertUiState(insertUiEvent = insertUiEvent)
    }

    suspend fun insertKontak() {
        viewModelScope.launch {
            try {
                kontakRepositori.insertKontak(insertKontakState.insertUiEvent.toKontak())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val telepon: String = ""
)