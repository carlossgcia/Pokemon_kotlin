package com.pokemonapp.models


import com.pokemonapp.models.*
import com.pokemonapp.models.TypeFactory.createType
import models.Trainer

fun main() {

    //TYPES
    val fireType = createType(ElementType.FIRE)

    //ATTACKS
    val ember = Attack("Ascuas", fireType, 40, null, 0)
    val flamethrower = Attack("Lanzallamas", fireType, 90, 0, 5)

    //POKEMON
    val pokemonA = Pokemon("Charmander", "charmander", fireType, 100, 100, 100, ember, flamethrower)
    val pokemonB = Pokemon("Bulbasaur", "bulbasur", fireType, 90, 90, 90, ember, flamethrower)

    //TRAINERS
    val trainerA = Trainer("Ash", listOf(pokemonA).toMutableList())
    val trainerB = Trainer("Brock", listOf(pokemonB).toMutableList())

    //COMBATS
    val combat = Combat(trainerA, trainerB)

    // Ejemplo de combate
    combat.executeTurn(Action.ATTACK)
    combat.executeTurn(Action.SWITCH)



    /*
    *  Despues definir los pokemons asignandole su tipo
    *  Definir el entrendor y asignarle los pokemons
    */

}

