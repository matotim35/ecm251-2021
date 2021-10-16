import Controller.DeckController
import Model.Card
import org.json.JSONArray
import org.json.JSONObject

fun main(){
    val deckController = DeckController()
    val carta = deckController.drawCard()
    println(carta)
}