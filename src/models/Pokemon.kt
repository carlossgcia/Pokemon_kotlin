package com.pokemonapp.models

data class Pokemon(
    val name: String,
    val nickname: String?,
    val type: String,               // Tipo del Pokémon (ej: "Fuego")
    var pcPoints: Int,         // Puntos de combate (PC)
    val maxPS: Int,    // PS máximo (salud total)
    var actualPS: Int    // PS actuales (salud actual)
) {
    init {
        if (actualPS > maxPS) {
            actualPS = maxPS
        }
    }

    fun hurt(damage: Int) {
        actualPS = (actualPS - damage).coerceAtLeast(0)
    }

    fun heal(heal: Int) {
        actualPS = (actualPS + heal).coerceAtMost(maxPS)
    }

    override fun toString(): String {
        return "Pokemon(nombre='$name', apodo='$nickname', tipo='$type', PC=$pcPoints, PS=$actualPS/$maxPS)"
    }
}
