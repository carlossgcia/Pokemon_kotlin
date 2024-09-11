package models

import com.pokemonapp.models.Pokemon

data class Trainer(
    val name: String,                    // Nombre del entrenador
    val pokemonTeam: MutableList<Pokemon> // Lista de Pokemons que tiene el entrenador (equipo Pokemon)
) {

    fun addPokemon(pokemon: Pokemon) {
        pokemonTeam.add(pokemon)
    }
    
    fun listTeam() {
        println("Equipo de $name:")
        pokemonTeam.forEach { println(it) }
    }

    override fun toString(): String {
        return "Entrenador(nombre='$name', equipo=${pokemonTeam.size} pokemons)"
    }
}
