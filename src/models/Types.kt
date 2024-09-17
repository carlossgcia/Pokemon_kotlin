package com.pokemonapp.models

import com.pokemonapp.*

data class Type(
    val name: String,
    val strengths: List<String>,
    val weaknesses: List<String>
) {
    fun isStrongAgainst(anotherType: Type): Boolean {
        return anotherType.name in strengths
    }

    fun isWeakAgainst(anotherType: Type): Boolean {
        return anotherType.name in weaknesses
    }
}

// Factory Design Pattern for creating Type instances
object TypeFactory {
    fun createType(typeName: String): Type {
        return when (typeName) {
            STEEL -> Type(
                name = STEEL,
                strengths = listOf(ROCK, FAIRY, ICE),
                weaknesses = listOf(FIGHTING, FIRE, GROUND)
            )

            WATER -> Type(
                name = WATER,
                strengths = listOf(GROUND, FIRE, ROCK),
                weaknesses = listOf(GRASS, ELECTRIC)
            )

            BUG -> Type(
                name = BUG,
                strengths = listOf(GRASS, PSYCHIC, DARK),
                weaknesses = listOf(FLYING, FIRE, ROCK)
            )

            DRAGON -> Type(
                name = DRAGON,
                strengths = listOf(DRAGON),
                weaknesses = listOf(FAIRY, ICE, DRAGON)
            )

            ELECTRIC -> Type(
                name = ELECTRIC,
                strengths = listOf(FLYING, WATER),
                weaknesses = listOf(GROUND)
            )

            GHOST -> Type(
                name = GHOST,
                strengths = listOf(GHOST, PSYCHIC),
                weaknesses = listOf(GHOST, DARK)
            )

            FIRE -> Type(
                name = FIRE,
                strengths = listOf(BUG, GRASS, STEEL, ICE),
                weaknesses = listOf(GROUND, WATER, ROCK)
            )

            FAIRY -> Type(
                name = FAIRY,
                strengths = listOf(DARK, FIGHTING, DRAGON),
                weaknesses = listOf(STEEL, POISON)
            )

            ICE -> Type(
                name = ICE,
                strengths = listOf(GRASS, GROUND, FLYING, DRAGON),
                weaknesses = listOf(FIGHTING, STEEL, ROCK, FIRE)
            )

            FIGHTING -> Type(
                name = FIGHTING,
                strengths = listOf(ROCK, ICE, STEEL, NORMAL, DARK),
                weaknesses = listOf(PSYCHIC, FLYING, FAIRY)
            )

            NORMAL -> Type(
                name = NORMAL,
                strengths = listOf(GHOST),
                weaknesses = listOf(FIGHTING)
            )

            GRASS -> Type(
                name = GRASS,
                strengths = listOf(GROUND, ROCK, WATER),
                weaknesses = listOf(FLYING, BUG, POISON, ICE, FIRE)
            )

            PSYCHIC -> Type(
                name = PSYCHIC,
                strengths = listOf(FIGHTING, POISON),
                weaknesses = listOf(BUG, GHOST, DARK)
            )

            ROCK -> Type(
                name = ROCK,
                strengths = listOf(FIRE, FLYING, ICE, BUG),
                weaknesses = listOf(FIGHTING, GROUND, STEEL, WATER, GRASS)
            )

            DARK -> Type(
                name = DARK,
                strengths = listOf(PSYCHIC, GHOST),
                weaknesses = listOf(FIGHTING, FAIRY, BUG)
            )

            GROUND -> Type(
                name = GROUND,
                strengths = listOf(FIRE, ELECTRIC, POISON, ROCK, STEEL),
                weaknesses = listOf(WATER, GRASS, ICE)
            )

            POISON -> Type(
                name = POISON,
                strengths = listOf(GRASS, FAIRY),
                weaknesses = listOf(GROUND, PSYCHIC)
            )

            FLYING -> Type(
                name = FLYING,
                strengths = listOf(BUG, FIGHTING, GRASS),
                weaknesses = listOf(ROCK, ICE, ELECTRIC)
            )

            else -> throw IllegalArgumentException("Unknown type: $typeName")
        }
    }
}
