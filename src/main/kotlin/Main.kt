import item.*
import jeu.Jeu
import personnage.Personnage

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

val typeEpeeLongue = TypeArme ( "Epee Longue", 1, 2, 5, 15)
val typePompe = TypeArme ("Shorty", 1, 4, 4, 16)
val typeAR = TypeArme ("Vandal", 1, 7, 3, 17)
val typeSnipe = TypeArme ("Operator", 1, 10, 2, 18)


fun main(args: Array<String>) {


    //Instantiation des armes

    val epee = Arme ("Epee Longue", "Epee Longue de premier niveau", typeEpeeLongue, qualiteCommun)
    val pompe = Arme ("Shorty", "Shorty le petit pompe", typePompe, qualiteRare)
    val aR = Arme ("Vandal", "Arme principal à rafale ", typeAR, qualiteEpic)
    val sniper = Arme ("Operator", "Arme de longue distance", typeSnipe, qualiteLegendaire)


    //Instantiation des bombes
    val bombe = BombeConstructor ("Spike", 15, 1, 5, "Dispositif explosif")

    //Instantiation des monstres
    val Troll = Personnage(
        "\u001B[32m \u001B[1m Trundle le Roi des Trolls \u001B[0m ",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 10,
        defense = 4,
        vitesse = 11,
        endurance = 6)
    // TODO Intermission 1 Ajouter d'autres monstres
    val Chogath = Personnage(
        "\u001B[1m Cho'gath la terreur noir",
        pointDeVie =100,
        pointDeVieMax = 100,
        attaque = 5,
        defense = 4,
        vitesse = 5,
        endurance = 6)

    val Darius = Personnage(
        "\u001B[35m \u001B[1m Dieu-roi Darius \u001B[0m",
        pointDeVie = 75,
        pointDeVieMax = 75,
        attaque = 24,
        defense = 5,
        vitesse = 15,
        endurance = 8)

    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf( Troll , Chogath , Darius ))
    //Lancement du jeu
    jeu.lancerCombat()
}