package com.pokemonapp.models

class Attack(
    val name: String,
    val type: Type,
    val damagePoints: Int,
    val isCharged: Boolean,
    var chargedLevel: Int?,
    val necessaryCharge: Int = 9,
) {
    fun setChargedLevel(level: Int?) {
        this.chargedLevel = level
    }
    fun getChargedLevel(): Int? {
        return this.chargedLevel
    }

    fun isCharged(): Boolean {
        return isCharged;
    }


}