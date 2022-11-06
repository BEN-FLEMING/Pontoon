package src;

import java.util.Random;

public class Deck {

    int deckSize = 52;
    public Card[] cardDeck = new Card[52];

    public Deck() {

        int i = 0;

        for (Card.Suit cardSuit : Card.Suit.values()) {
            for (Card.Value cardValue : Card.Value.values()) {
                this.cardDeck[i] = new Card(cardSuit, cardValue);
                i++;
            }

        }
    }

    public Card[] getCardDeck() {
        return cardDeck;
    }

    public void reset() {
        for (int i = 0; i < 52-(this.cardDeck.length); i++) {
            deckSize++;
        }
        Card[] cardDeckShell = new Card[52];
        this.cardDeck = cardDeckShell;
        Deck newDeck = new Deck();
        this.cardDeck = newDeck.cardDeck;

    }

    public void shuffle() {

        int min = 0;
        int max = this.cardDeck.length;
        Card tempCard;

        for (int i = 0; i < cardDeck.length; i++) {
            Random randOne = new Random();
            int randomOne = randOne.nextInt(max - min) + min;
            tempCard = cardDeck[i];
            cardDeck[i] = cardDeck[randomOne];
            cardDeck[randomOne] = tempCard;
        }

        // Maybe add current card = 1?
    }

    public Card getCard(int i) {
        Card returnCard = this.cardDeck[i];
        return returnCard;
    }

    public Card dealRandomCard(){

        int min = 0;
        int max = cardDeck.length;
        Card[] tempCardArray = new Card[cardDeck.length-1];

        Random randOne = new Random();
        int randomOne = randOne.nextInt(max - min) + min;

        Card cardToDeal = new Card(cardDeck[randomOne].getSuit(), cardDeck[randomOne].getValue());       //deals card

        for (int i = 0, j = 0; i <= (cardDeck.length-1); i++) {
            if (i != randomOne){
                tempCardArray[j++] = cardDeck[i];
            }

        }
        this.deckSize--;
        this.cardDeck = tempCardArray;
        return cardToDeal;


    }

    public int size(){
        return this.deckSize;
    }

}
