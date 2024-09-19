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

object TypeFactory {
    fun createType(typeName: ElementType): Type {
        return when (typeName) {
            ElementType.STEEL -> Type(
                name = ElementType.STEEL.type,
                strengths = listOf(ElementType.ROCK.type, ElementType.FAIRY.type, ElementType.ICE.type),
                weaknesses = listOf(ElementType.FIGHTING.type, ElementType.FIRE.type, ElementType.GROUND.type)
            )

            ElementType.WATER -> Type(
                name = ElementType.WATER.type,
                strengths = listOf(ElementType.GROUND.type, ElementType.FIRE.type, ElementType.ROCK.type),
                weaknesses = listOf(ElementType.GRASS.type, ElementType.ELECTRIC.type)
            )

            ElementType.BUG -> Type(
                name = ElementType.BUG.type,
                strengths = listOf(ElementType.GRASS.type, ElementType.PSYCHIC.type, ElementType.DARK.type),
                weaknesses = listOf(ElementType.FLYING.type, ElementType.FIRE.type, ElementType.ROCK.type)
            )

            ElementType.DRAGON -> Type(
                name = ElementType.DRAGON.type,
                strengths = listOf(ElementType.DRAGON.type),
                weaknesses = listOf(ElementType.FAIRY.type, ElementType.ICE.type, ElementType.DRAGON.type)
            )

            ElementType.ELECTRIC -> Type(
                name = ElementType.ELECTRIC.type,
                strengths = listOf(ElementType.FLYING.type, ElementType.WATER.type),
                weaknesses = listOf(ElementType.GROUND.type)
            )

            ElementType.GHOST -> Type(
                name = ElementType.GHOST.type,
                strengths = listOf(ElementType.GHOST.type, ElementType.PSYCHIC.type),
                weaknesses = listOf(ElementType.GHOST.type, ElementType.DARK.type)
            )

            ElementType.FIRE -> Type(
                name = ElementType.FIRE.type,
                strengths = listOf(ElementType.BUG.type, ElementType.GRASS.type, ElementType.STEEL.type, ElementType.ICE.type),
                weaknesses = listOf(ElementType.GROUND.type, ElementType.WATER.type, ElementType.ROCK.type)
            )

            ElementType.FAIRY -> Type(
                name = ElementType.FAIRY.type,
                strengths = listOf(ElementType.DARK.type, ElementType.FIGHTING.type, ElementType.DRAGON.type),
                weaknesses = listOf(ElementType.STEEL.type, ElementType.POISON.type)
            )

            ElementType.ICE -> Type(
                name = ElementType.ICE.type,
                strengths = listOf(ElementType.GRASS.type, ElementType.GROUND.type, ElementType.FLYING.type, ElementType.DRAGON.type),
                weaknesses = listOf(ElementType.FIGHTING.type, ElementType.STEEL.type, ElementType.ROCK.type, ElementType.FIRE.type)
            )

            ElementType.FIGHTING -> Type(
                name = ElementType.FIGHTING.type,
                strengths = listOf(ElementType.ROCK.type, ElementType.ICE.type, ElementType.STEEL.type, ElementType.NORMAL.type, ElementType.DARK.type),
                weaknesses = listOf(ElementType.PSYCHIC.type, ElementType.FLYING.type, ElementType.FAIRY.type)
            )

            ElementType.NORMAL -> Type(
                name = ElementType.NORMAL.type,
                strengths = listOf(ElementType.GHOST.type),
                weaknesses = listOf(ElementType.FIGHTING.type)
            )

            ElementType.GRASS -> Type(
                name = ElementType.GRASS.type,
                strengths = listOf(ElementType.GROUND.type, ElementType.ROCK.type, ElementType.WATER.type),
                weaknesses = listOf(ElementType.FLYING.type, ElementType.BUG.type, ElementType.POISON.type, ElementType.ICE.type, ElementType.FIRE.type)
            )

            ElementType.PSYCHIC -> Type(
                name = ElementType.PSYCHIC.type,
                strengths = listOf(ElementType.FIGHTING.type, ElementType.POISON.type),
                weaknesses = listOf(ElementType.BUG.type, ElementType.GHOST.type, ElementType.DARK.type)
            )

            ElementType.ROCK -> Type(
                name = ElementType.ROCK.type,
                strengths = listOf(ElementType.FIRE.type, ElementType.FLYING.type, ElementType.ICE.type, ElementType.BUG.type),
                weaknesses = listOf(ElementType.FIGHTING.type, ElementType.GROUND.type, ElementType.STEEL.type, ElementType.WATER.type, ElementType.GRASS.type)
            )

            ElementType.DARK -> Type(
                name = ElementType.DARK.type,
                strengths = listOf(ElementType.PSYCHIC.type, ElementType.GHOST.type),
                weaknesses = listOf(ElementType.FIGHTING.type, ElementType.FAIRY.type, ElementType.BUG.type)
            )

            ElementType.GROUND -> Type(
                name = ElementType.GROUND.type,
                strengths = listOf(ElementType.FIRE.type, ElementType.ELECTRIC.type, ElementType.POISON.type, ElementType.ROCK.type, ElementType.STEEL.type),
                weaknesses = listOf(ElementType.WATER.type, ElementType.GRASS.type, ElementType.ICE.type)
            )

            ElementType.POISON -> Type(
                name = ElementType.POISON.type,
                strengths = listOf(ElementType.GRASS.type, ElementType.FAIRY.type),
                weaknesses = listOf(ElementType.GROUND.type, ElementType.PSYCHIC.type)
            )

            ElementType.FLYING -> Type(
                name = ElementType.FLYING.type,
                strengths = listOf(ElementType.BUG.type, ElementType.FIGHTING.type, ElementType.GRASS.type),
                weaknesses = listOf(ElementType.ROCK.type, ElementType.ICE.type, ElementType.ELECTRIC.type)
            )

            ElementType.UNKNOWN -> Type(
                name = ElementType.UNKNOWN.type,
                strengths = listOf(),
                weaknesses = listOf()
            )
        }
    }
}

