package Controller

import Model.Card
import Model.Deck
import Service.HttpService
import org.json.JSONArray
import org.json.JSONObject
import shared.DeckOfCardsAPIConstants

class DeckController {
    val deck:Deck
    constructor(){
        val resposta = HttpService.getJson(DeckOfCardsAPIConstants.newDeckUrl)
        this.deck = Deck(resposta["deck_id"] as String)
    }

    public fun drawCard() : Card {
        val cards_resposta = HttpService.getJson(DeckOfCardsAPIConstants.getOneCardUrl(this.deck.deckId))
        val valores_das_carta= cards_resposta["cards"] as JSONArray
        val primeira_carta= valores_das_carta[0] as JSONObject
        return Card(primeira_carta["suit"] as String, primeira_carta["value"] as String, primeira_carta["image"] as String)
    }
}