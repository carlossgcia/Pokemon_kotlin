package models

import com.pokemonapp.models.Pokemon

data class Trainer(
    val name: String,
    val pokemonTeam: MutableList<Pokemon>,

) {
    var activePokemon: Pokemon = pokemonTeam[0]

    fun switchActivePokemon() {
        activePokemon = pokemonTeam.first { it.actualPS > 0 && it != activePokemon }
    }
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
