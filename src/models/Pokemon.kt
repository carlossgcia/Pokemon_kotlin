package com.pokemonapp.models

data class Pokemon(
    val name: String,
    val nickname: String?,
    val type: Type,
    var pcPoints: Int,
    val maxPS: Int,
    var actualPS: Int
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

    fun compareStrenghts(pokemonOponente: Pokemon): String {
        return when {
            type.isStrongAgainst(pokemonOponente.type) -> "${name} es fuerte contra ${pokemonOponente.name}"
            type.isWeakAgainst(pokemonOponente.type) -> "${name} es débil contra ${pokemonOponente.name}"
            else -> "${name} y ${pokemonOponente.name} tienen tipos neutrales entre sí."
        }
    }

    override fun toString(): String {
        return "Pokemon(nombre='$name', apodo='$nickname', tipo='$type', PC=$pcPoints, PS=$actualPS/$maxPS)"
    }
}


