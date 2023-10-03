package item
import personnage.Personnage

class Armure(
    val nom: String,
    val description: String,
    var typeArmure: TypeArmure,
    var qualite: Qualite
)

{
    fun calculProtection(): Int {
        val additionProtection = this.typeArmure.bonus + this.qualite.bonusRarete
        return additionProtection
    }
}
