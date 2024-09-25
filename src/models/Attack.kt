package com.pokemonapp.models

class Attack(
    val name: String,
    val type: Type,
    val damagePoints: Int,

    val chargedLevel: Int,
    val necessaryCharge: Int? = 9,

) {
    override fun toString(): String {
        return "Attack(name='$name', type=$type, damagePoints=$damagePoints, chargedLevel=$chargedLevel, necessaryCharge=$necessaryCharge)"
    }

}