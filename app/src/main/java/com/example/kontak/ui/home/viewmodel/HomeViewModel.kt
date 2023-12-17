package com.example.kontak.ui.home.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kontak.Repositori.KontakRepositori
import com.example.kontak.model.Kontak
import kotlinx.coroutines.launch
import java.io.IOException

sealed class KontakUIState {
    data class Success(val kontak: List<Kontak>) : KontakUIState()

    object Error : KontakUIState()
    object Loading : KontakUIState()
}

class HomeViewModel (private val kontakRepositori: KontakRepositori) : ViewModel(){
    var kontakUIState: KontakUIState by mutableStateOf(KontakUIState.Loading)
        private set

    init {
        getKontak()
    }
    fun getKontak(){
        viewModelScope.launch{
            kontakUIState = KontakUIState.Loading
            kontakUIState = try {
                KontakUIState.Success(kontakRepositori.getKontak())
            }
            catch (e: IOException){
                KontakUIState.Error
            }
        }
    }
}
