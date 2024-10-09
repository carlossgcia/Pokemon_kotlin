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
        if (fastAttack.necessaryCharge != null ) {
            throw IllegalArgumentException("Error: El ataque rápido ${fastAttack.name} de $name no puede tener un nivel de carga superior a 1.")
        }

        if (chargedAttack.necessaryCharge!! > 0 ) {
            throw IllegalArgumentException("Error: El ataque cargado ${chargedAttack.name} de $name debe requerir una carga significativa.")
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
    fun resetChargedAttack() {
        chargedAttack.chargedLevel= 0
    }


    override fun toString(): String {
        return "Pokemon(nombre='$name', apodo='$nickname', tipo='$type', PC=$pcPoints, PS=$actualPS/$maxPS)"
    }
}
