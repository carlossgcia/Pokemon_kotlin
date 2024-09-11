package com.pokemonapp

import com.pokemonapp.models.Pokemon
import models.Trainer

fun main() {
    // Crear algunos pokémon
    val pikachu = Pokemon(name = "Pikachu", nickname = "Sparky", type = "Eléctrico", pcPoints = 120, maxPS = 100, actualPS = 100)
    val charmander = Pokemon(name = "Charmander", nickname = "Flare", type = "Fuego", pcPoints = 110, maxPS = 90, actualPS = 85)

    // Crear un entrenador y añadir los pokémons
    val entrenadorAsh = Trainer(name = "Ash", pokemonTeam = mutableListOf())
    entrenadorAsh.addPokemon(pikachu)
    entrenadorAsh.addPokemon(charmander)

    // Mostrar el equipo del entrenador
    entrenadorAsh.listTeam()

    // Hacer que un Pokémon reciba daño y mostrar su estado
    pikachu.hurt(30)
    println("Después de recibir daño:")
    entrenadorAsh.listTeam()

    // Curar al Pokémon
    pikachu.heal(20)
    println("Después de curar:")
    entrenadorAsh.listTeam()
}
