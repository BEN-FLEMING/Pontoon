package src;

import java.util.ArrayList;

public class Card {

    public static enum Suit {CLUBS, HEARTS, DIAMONDS, SPADES}

    public static enum Value {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    Suit cardSuit;
    Value cardValue;

    public Card(Suit mySuit, Value myValue) {
        this.cardSuit = mySuit;
        this.cardValue = myValue;
    }

    public Suit getSuit() {
        return cardSuit;
    }

    public void setSuit(Suit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public Value getValue() {
        return cardValue;
    }

    public void setValue(Value cardValue) {
        this.cardValue = cardValue;
    }

    public ArrayList<Integer> getNumericalValue() {

        ArrayList<Integer> numericalValue = new ArrayList<Integer>();

        switch (cardValue) {
            case ACE:
                numericalValue.add(1);
                numericalValue.add(11);
                break;
            case TWO:
                numericalValue.add(2);
                break;
            case THREE:
                numericalValue.add(3);
                break;
            case FOUR:
                numericalValue.add(4);
                break;
            case FIVE:
                numericalValue.add(5);
                break;
            case SIX:
                numericalValue.add(6);
                break;
            case SEVEN:
                numericalValue.add(7);
                break;
            case EIGHT:
                numericalValue.add(8);
                break;
            case NINE:
                numericalValue.add(9);
                break;
            case TEN:
                numericalValue.add(10);
                break;
            case JACK:
                numericalValue.add(10);
                break;
            case QUEEN:
                numericalValue.add(10);
                break;
            case KING:
                numericalValue.add(10);
                break;
        }

        return numericalValue;
    }

}
