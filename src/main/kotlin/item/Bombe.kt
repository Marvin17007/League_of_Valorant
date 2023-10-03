package item

import jeu.TirageDes
import personnage.Personnage


class BombeConstructor(var nom :String, var nombreDeDes : Int, var maxDe : Int, var description: String){

    fun utiliser(cible: Personnage) {
        val des = TirageDes(nombreDeDes, maxDe)
        val degats = des.lance()

        val protectionCible = cible.calculeDefense()
        val degatsApresProtection = maxOf(degats - protectionCible, 1)

        cible.pointDeVie -= degatsApresProtection

        println("la bombe a fait $degatsApresProtection point de degats ")

    }

}