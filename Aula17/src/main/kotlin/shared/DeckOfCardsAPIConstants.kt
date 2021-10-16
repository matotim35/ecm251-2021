package shared

class DeckOfCardsAPIConstants {
    companion object {
        val baseUrl = "https://deckofcardsapi.com/api/deck"
        val newDeckUrl = "$baseUrl/new/shuffle/?deck_count=1"
        fun getOneCardUrl(deckId: String) = "$baseUrl/$deckId/draw/?count=1"

    }
}