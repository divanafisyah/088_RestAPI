package com.example.kontak.ui.home.screen

import com.example.kontak.navigation.DestinasiNavigasi

object DetailsDestination : DestinasiNavigasi{
    override val route = "item_details"
    override val titleRes = "Detail Kontak"
    const val kontakId = "itemId"
    val routeWithArgs = "$route/{$kontakId"
}