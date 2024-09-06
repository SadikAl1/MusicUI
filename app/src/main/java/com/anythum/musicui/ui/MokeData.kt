package com.anythum.musicui.ui

import com.anythum.musicui.R

data class SongsData(
    val id: Int,
    val img: Int,
    val title: String,
    val artist: String,
    val duration: String

)

fun SongsDatarepo(): List<SongsData> {
    return listOf(
        SongsData(1, R.drawable._3, "White c63", "Mercedes", "3:45"),
        SongsData(2, R.drawable.backd, "Shinobu", "Demon", "3:45"),
        SongsData(3, R.drawable.dbz, "DBZ", "Son Goku", "3:45"),
        SongsData(4, R.drawable.icon, "Iconic", "Big Brother", "3:45"),
        SongsData(5, R.drawable.idaten_jump, "Idaten", "DEAD Hadees", "3:45"),
        SongsData(6, R.drawable.mishoku_tensa, "Mishoku", "Rudues", "3:45"),
        SongsData(7, R.drawable.solo_level, "Solo Leveling", "Sung Jin-Woo", "3:45"),
        SongsData(8, R.drawable.spy_x_family, "Family", "Aaniya", "3:45"),
        SongsData(9, R.drawable.login, "Login Krlo", "Lok", "3:45"),
        SongsData(10, R.drawable.paneer, "Paneer Pizza", "Pizza Hut", "3:45"),
        SongsData(11, R.drawable.backgr, "Them", "Anima", "3:45"),
        SongsData(12, R.drawable.m5, "Super Car killer", "B.M.W", "3:45"),
    )

}