package com.pokemonapp

import com.pokemonapp.models.Pokemon
import com.pokemonapp.models.Type
import models.Trainer

fun main() {
    /*
    val acero = Type(
        name = "Acero",
        strengths = listOf("Roca", "Hada", "Hielo"),
        weaknesses = listOf("Lucha", "Fuego", "Tierra")
    )

    val agua = Type(
        name = "Agua",
        strengths = listOf("Tierra", "Fuego", "Roca"),
        weaknesses = listOf("Planta", "Eléctrico")
    )

    val bicho = Type(
        name = "Bicho",
        strengths = listOf("Planta", "Psíquico", "Siniestro"),
        weaknesses = listOf("Volador", "Fuego", "Roca")
    )

    val dragon = Type(
        name = "Dragón",
        strengths = listOf("Dragón"),
        weaknesses = listOf("Hada", "Hielo", "Dragón")
    )

    val electrico = Type(
        name = "Eléctrico",
        strengths = listOf("Volador", "Agua"),
        weaknesses = listOf("Tierra")
    )

    val fantasma = Type(
        name = "Fantasma",
        strengths = listOf("Fantasma", "Psíquico"),
        weaknesses = listOf("Fantasma", "Siniestro")
    )

    val fuego = Type(
        name = "Fuego",
        strengths = listOf("Bicho", "Planta", "Acero", "Hielo"),
        weaknesses = listOf("Tierra", "Agua", "Roca")
    )

    val hada = Type(
        name = "Hada",
        strengths = listOf("Siniestro", "Lucha", "Dragón"),
        weaknesses = listOf("Acero", "Veneno")
    )

    val hielo = Type(
        name = "Hielo",
        strengths = listOf("Planta", "Tierra", "Volador", "Dragón"),
        weaknesses = listOf("Lucha", "Acero", "Roca", "Fuego")
    )

    val lucha = Type(
        name = "Lucha",
        strengths = listOf("Roca", "Hielo", "Acero", "Normal", "Siniestro"),
        weaknesses = listOf("Psíquico", "Volador", "Hada")
    )

    val normal = Type(
        name = "Normal",
        strengths = listOf("Fantasma"),
        weaknesses = listOf("Lucha")
    )

    val planta = Type(
        name = "Planta",
        strengths = listOf("Tierra", "Roca", "Agua"),
        weaknesses = listOf("Volador", "Bicho", "Veneno", "Hielo", "Fuego")
    )

    val psiquico = Type(
        name = "Psíquico",
        strengths = listOf("Lucha", "Veneno"),
        weaknesses = listOf("Bicho", "Fantasma", "Siniestro")
    )

    val roca = Type(
        name = "Roca",
        strengths = listOf("Fuego", "Volador", "Hielo", "Bicho"),
        weaknesses = listOf("Lucha", "Tierra", "Acero", "Agua", "Planta")
    )

    val siniestro = Type(
        name = "Siniestro",
        strengths = listOf("Psíquico", "Fantasma"),
        weaknesses = listOf("Lucha", "Hada", "Bicho")
    )

    val tierra = Type(
        name = "Tierra",
        strengths = listOf("Fuego", "Eléctrico", "Veneno", "Roca", "Acero"),
        weaknesses = listOf("Agua", "Planta", "Hielo")
    )

    val veneno = Type(
        name = "Veneno",
        strengths = listOf("Planta", "Hada"),
        weaknesses = listOf("Tierra", "Psíquico")
    )

    val volador = Type(
        name = "Volador",
        strengths = listOf("Bicho", "Lucha", "Planta"),
        weaknesses = listOf("Roca", "Hielo", "Eléctrico")
    )
    */

    val steel = Type(
        name = "Steel",
        strengths = listOf("Rock", "Fairy", "Ice"),
        weaknesses = listOf("Fighting", "Fire", "Ground")
    )

    val water = Type(
        name = "Water",
        strengths = listOf("Ground", "Fire", "Rock"),
        weaknesses = listOf("Grass", "Electric")
    )

    val bug = Type(
        name = "Bug",
        strengths = listOf("Grass", "Psychic", "Dark"),
        weaknesses = listOf("Flying", "Fire", "Rock")
    )

    val dragon = Type(
        name = "Dragon",
        strengths = listOf("Dragon"),
        weaknesses = listOf("Fairy", "Ice", "Dragon")
    )

    val electric = Type(
        name = "Electric",
        strengths = listOf("Flying", "Water"),
        weaknesses = listOf("Ground")
    )

    val ghost = Type(
        name = "Ghost",
        strengths = listOf("Ghost", "Psychic"),
        weaknesses = listOf("Ghost", "Dark")
    )

    val fire = Type(
        name = "Fire",
        strengths = listOf("Bug", "Grass", "Steel", "Ice"),
        weaknesses = listOf("Ground", "Water", "Rock")
    )

    val fairy = Type(
        name = "Fairy",
        strengths = listOf("Dark", "Fighting", "Dragon"),
        weaknesses = listOf("Steel", "Poison")
    )

    val ice = Type(
        name = "Ice",
        strengths = listOf("Grass", "Ground", "Flying", "Dragon"),
        weaknesses = listOf("Fighting", "Steel", "Rock", "Fire")
    )

    val fighting = Type(
        name = "Fighting",
        strengths = listOf("Rock", "Ice", "Steel", "Normal", "Dark"),
        weaknesses = listOf("Psychic", "Flying", "Fairy")
    )

    val normal = Type(
        name = "Normal",
        strengths = listOf("Ghost"),
        weaknesses = listOf("Fighting")
    )

    val grass = Type(
        name = "Grass",
        strengths = listOf("Ground", "Rock", "Water"),
        weaknesses = listOf("Flying", "Bug", "Poison", "Ice", "Fire")
    )

    val psychic = Type(
        name = "Psychic",
        strengths = listOf("Fighting", "Poison"),
        weaknesses = listOf("Bug", "Ghost", "Dark")
    )

    val rock = Type(
        name = "Rock",
        strengths = listOf("Fire", "Flying", "Ice", "Bug"),
        weaknesses = listOf("Fighting", "Ground", "Steel", "Water", "Grass")
    )

    val dark = Type(
        name = "Dark",
        strengths = listOf("Psychic", "Ghost"),
        weaknesses = listOf("Fighting", "Fairy", "Bug")
    )

    val ground = Type(
        name = "Ground",
        strengths = listOf("Fire", "Electric", "Poison", "Rock", "Steel"),
        weaknesses = listOf("Water", "Grass", "Ice")
    )

    val poison = Type(
        name = "Poison",
        strengths = listOf("Grass", "Fairy"),
        weaknesses = listOf("Ground", "Psychic")
    )

    val flying = Type(
        name = "Flying",
        strengths = listOf("Bug", "Fighting", "Grass"),
        weaknesses = listOf("Rock", "Ice", "Electric")
    )

    /*
    *  Despues definir los pokemons asignandole su tipo
    *  Definir el entrendor y asignarle los pokemons
    */

}
