package com.pokemonapp.models

data class Pokemon(
    val name: String,
    val nickname: String?,
    val type: Type,
    var pcPoints: Int,
    val maxPS: Int,
    var actualPS: Int,
    var fastAttack: Attack,
    var chargedAttack: Attack
) {

    init {
        if (actualPS > maxPS) {
            actualPS = maxPS
        }
    }

    fun atack(rivalPokemon: Pokemon) {
        if (chargedAttack.isCharged()) {
            if (chargedAttack.chargedLevel ?: 0 >= chargedAttack.necessaryCharge) {
                rivalPokemon.hurt(chargedAttack.damagePoints)
                chargedAttack.setChargedLevel(0)
            } else {
                println("No hay suficiente carga para ejecutar este ataque.")
                chargedAttack.getChargedLevel()?.let { level ->
                    chargedAttack.setChargedLevel(level + 1)
                }
            }
        }
    }

    fun hurt(damagePoints: Int) {
        actualPS = (actualPS - damagePoints).coerceAtLeast(0)
    }

    fun heal(heal: Int) {
        actualPS = (actualPS + heal).coerceAtMost(maxPS)
    }

    fun compareStrenghts(rivalPokemon: Pokemon): String {
        return when {
            type.isStrongAgainst(rivalPokemon.type) -> "${name} es fuerte contra ${rivalPokemon.name}"
            type.isWeakAgainst(rivalPokemon.type) -> "${name} es débil contra ${rivalPokemon.name}"
            else -> "${name} y ${rivalPokemon.name} tienen tipos neutrales entre sí."
        }
    }

    override fun toString(): String {
        return "Pokemon(nombre='$name', apodo='$nickname', tipo='$type', PC=$pcPoints, PS=$actualPS/$maxPS)"
    }
}
