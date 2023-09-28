package item

import jdk.jfr.Description
import jeu.TirageDes
import qualiteCommun
import qualiteRare
import qualiteEpic
import qualiteLegendaire


class Arme(
    val nom: String,
    val description: String,
    val typeArme: TypeArme,
    var qualite: Qualite
) {

    fun calculDegat(): Int {
        // Lancer un dé avec la valeur maximale du type d'arme
        val des = TirageDes(this.typeArme.NombreDes, this.typeArme.ValeurDeMax)

        // Utilisation de la méthode lance() pour obtenir le résultat du lancé
        val resultat = des.lance()

        //TODO: Tirer 1d20
        val desCritique = TirageDes(1, 20)

        if (desCritique.lance() >= this.typeArme.activationCritique) {

            val degatsCritiques = resultat * this.typeArme.multiplicateurCritique

            val degatsAvecBonus = degatsCritiques + this.qualite.bonusRarete

            return degatsAvecBonus
        } else {
            val degatsAvecBonus = resultat + this.qualite.bonusRarete
            return degatsAvecBonus
        }
    }

}