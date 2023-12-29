package com.example.kontak.ui.home.screen

import com.example.kontak.navigation.DestinasiNavigasi

object EditDestination : DestinasiNavigasi{
    override val route = "edit"
    override val titleRes = "Edit Kontak"
    const val kontakId = "itemId"
    val routeWithArgs = "$route/{$kontakId"
}