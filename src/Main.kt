package com.pokemonapp.models

import com.pokemonapp.ElementType

fun main() {
    // Creación de tipos
    val fireType = TypeFactory.createType(ElementType.FIRE)
    val waterType = TypeFactory.createType(ElementType.WATER)

    // Creación de ataques
    val flamethrower = Attack(name = "Lanzallamas", type = fireType, damagePoints = 90, chargedLevel = 5, necessaryCharge = 3)
    val hydroPump = Attack(name = "Hidrobomba", type = waterType, damagePoints = 110, chargedLevel = 7)

    // Creación de Pokémon
    val charizard = Pokemon(name = "Charizard", nickname = "Chari", type = fireType, pcPoints = 3000, maxPS = 180, actualPS = 180, fastAttack = flamethrower, chargedAttack = hydroPump)
    val blastoise = Pokemon(name = "Blastoise", nickname = "Blasty", type = waterType, pcPoints = 2900, maxPS = 200, actualPS = 200, fastAttack = hydroPump, chargedAttack = flamethrower)

    // Imprimir detalles del Pokémon
    println(charizard)
    println(blastoise)

    // Imprimir detalles de los ataques
    println(flamethrower)
    println(hydroPump)

    // Simular ataque y daño
    charizard.attack()
    blastoise.hurt(flamethrower.damagePoints)

    // Comparar fortalezas entre Pokémon
    println(charizard.compareStrenghts(blastoise))
}