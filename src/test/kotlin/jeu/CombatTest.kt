package jeu

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import personnage.Personnage

class CombatTest {

    @Test
    fun tourDeMonstre() {
        val gob = Personnage(
            "XXX le gobelin",
            pointDeVie = 20,
            pointDeVieMax = 20,
            attaque = 5,
            defense = 4,
            vitesse = 11,
            endurance = 6)

    }
}