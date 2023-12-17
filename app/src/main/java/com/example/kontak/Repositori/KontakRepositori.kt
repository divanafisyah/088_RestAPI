package com.example.kontak.Repositori

import com.example.kontak.model.Kontak
import com.example.kontak.service.api.KontakService

interface KontakRepositori {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepositori(
    private val kontakApiService: KontakService
) : KontakRepositori{
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}