package com.pokemonapp.models

class Attack(
    val name: String,
    val type: Type,
    val damagePoints: Int,
    var chargedLevel: Int? = null,
    val necessaryCharge: Int = 0,
) {
    /*fun setChargedLevel(level: Int?) {
        this.chargedLevel = level
    }

    fun getChargedLevel(): Int? {
        return this.chargedLevel
    }*/

    override fun toString(): String {
        return "Attack(name='$name', type=$type, damagePoints=$damagePoints, chargedLevel=$chargedLevel, necessaryCharge=$necessaryCharge)"
    }


}