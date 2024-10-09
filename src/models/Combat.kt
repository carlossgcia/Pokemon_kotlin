package com.pokemonapp.models

import models.Trainer

enum class Action {
    ATTACK,
    SWITCH,
    RETREAT
}
class Combat(val trainerA: Trainer, val trainerB: Trainer) {

    var currentTurn: Trainer = trainerA

    fun executeTurn(action: Action) {
        when (action) {
            Action.ATTACK -> attack()
            Action.SWITCH -> switchPokemon()
            Action.RETREAT -> retreat()
        }
        currentTurn = if (currentTurn == trainerA) trainerB else trainerA
    }

    fun attack() {
        val attackingPokemon = currentTurn.activePokemon
        val attackingTrainer = currentTurn.name
        val defendingTrainer = if (currentTurn == trainerA) trainerB else trainerA
        val defendingPokemon = defendingTrainer.activePokemon

        if (!isChargedAttack(attackingPokemon.chargedAttack)) {
            doFastAttack(attackingPokemon, defendingPokemon, attackingTrainer)
        } else {
            doChargedAttack(attackingPokemon, defendingPokemon, attackingTrainer)
        }
    }

    fun isChargedAttack(chargedAttack: Attack): Boolean {
        val chargedLevel = chargedAttack.chargedLevel ?: return false
        return chargedLevel >= chargedAttack.necessaryCharge
    }

    fun doFastAttack(
        attackingPokemon: Pokemon,
        defendingPokemon: Pokemon,
        attackingTrainer: String
    ) {
        val fastDamage = (attackingPokemon.fastAttack.damagePoints * (attackingPokemon.pcPoints / 100.0)).toInt()
        defendingPokemon.hurt(fastDamage)
        println("El ${attackingPokemon.name} de ${attackingTrainer} usó ${attackingPokemon.chargedAttack.name} (ataque RAPIDO) y causó ${fastDamage} de daño")
    }

    fun doChargedAttack(
        attackingPokemon: Pokemon,
        defendingPokemon: Pokemon,
        attackingTrainer: String
    ) {
        val baseDamage = attackingPokemon.chargedAttack.damagePoints
        val chargedExtraDamage = 0.25
        val bonus = baseDamage * chargedExtraDamage
        val PCpercentage = attackingPokemon.pcPoints / 100.0
        val totalDamage = ((baseDamage + bonus) * PCpercentage).toInt()

        defendingPokemon.hurt(totalDamage)
        println("El ${attackingPokemon.name} de ${attackingTrainer} usó ${attackingPokemon.chargedAttack.name} (ataque CARGADO) y causó ${totalDamage} de daño")

        currentTurn.activePokemon.resetChargedAttack()
    }

    fun switchPokemon() {
        println("${currentTurn.name} cambió su Pokémon")
        currentTurn.switchActivePokemon()
        currentTurn.activePokemon.resetChargedAttack()
    }

    fun retreat() {
        println("${currentTurn.name} se retiró del combate")
    }

    fun isCombatOver(): Boolean {
        return trainerA.pokemonTeam.none { it.actualPS > 0 } || trainerB.pokemonTeam.none { it.actualPS > 0 }
    }
}
