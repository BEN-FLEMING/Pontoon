package src;

import java.util.ArrayList;

public class Player {

    ArrayList<Card> cardsInHand = new ArrayList<Card>();
    public ArrayList<Card.Suit> handSuits = new ArrayList<Card.Suit>();
    public ArrayList<Card.Value> handValues = new ArrayList<Card.Value>();

    public String playerName;

    public Player(String name) {
        this.playerName = name;
    }

    public String getName() {
        return this.playerName;
    }

    public void dealToPlayer(Card card) {
        this.cardsInHand.add(card);
        this.handSuits.add(card.cardSuit);
        this.handValues.add(card.cardValue);
    }

    public void removeCard(Card card) {
        this.handSuits.remove(card.cardSuit);
        this.handValues.remove(card.cardValue);
        this.cardsInHand.remove(card);
    }

    public ArrayList<Integer> getNumericalHandValue() {

        ArrayList<Integer> numericalHandValues = new ArrayList<Integer>();
        ArrayList<Integer> overallHandValue = new ArrayList<Integer>();
        ArrayList<Integer> aceHandValues = new ArrayList<Integer>();

        int acesPresent = 0;
        int sum = 0;

        for (int b = 0; b < handValues.size(); b++) {                               //adds all values as ints to an arraylist
            switch (handValues.get(b)) {
                case ACE:
                    numericalHandValues.add(1);
                    aceHandValues.add(11);
                    acesPresent++;
                    break;
                case TWO:
                    numericalHandValues.add(2);
                    break;
                case THREE:
                    numericalHandValues.add(3);
                    break;
                case FOUR:
                    numericalHandValues.add(4);
                    break;
                case FIVE:
                    numericalHandValues.add(5);
                    break;
                case SIX:
                    numericalHandValues.add(6);
                    break;
                case SEVEN:
                    numericalHandValues.add(7);
                    break;
                case EIGHT:
                    numericalHandValues.add(8);
                    break;
                case NINE:
                    numericalHandValues.add(9);
                    break;
                case TEN:
                    numericalHandValues.add(10);
                    break;
                case JACK:
                    numericalHandValues.add(10);
                    break;
                case QUEEN:
                    numericalHandValues.add(10);
                    break;
                case KING:
                    numericalHandValues.add(10);
                    break;
            }
        }

        if (acesPresent == 0){
            for (int i = 0; i < numericalHandValues.size(); i++) {
                sum += numericalHandValues.get(i);
            }
            overallHandValue.add(sum);
        }

        if (acesPresent == 1){
            for (int i = 0; i < numericalHandValues.size(); i++) {
                sum += numericalHandValues.get(i);
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size(); j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
        }

        if (acesPresent == 2){
            for (int i = 0; i < numericalHandValues.size(); i++) {
                sum += numericalHandValues.get(i);
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-1; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-1; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
        }

        if (acesPresent == 3){
            for (int i = 0; i < numericalHandValues.size(); i++) {
                sum += numericalHandValues.get(i);
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-2; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-2; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-2; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
        }

        if (acesPresent == 4){
            for (int i = 0; i < numericalHandValues.size(); i++) {
                sum += numericalHandValues.get(i);
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-3; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-3; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-3; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
            for (int j = 0; j < aceHandValues.size()-3; j++) {
                sum += aceHandValues.get(0)-1;
            }
            overallHandValue.add(sum);
        }

        int temp;

        for (int i = 0; i < overallHandValue.size(); i++) {                 //bubble sort the arraylist
            for (int j = 0; j < (overallHandValue.size() - 1); j++) {
                if (overallHandValue.get(j) > overallHandValue.get(j + 1)) {
                    temp = overallHandValue.get(j);
                    overallHandValue.set(j, overallHandValue.get(j + 1));
                    overallHandValue.set(j + 1, temp);
                }
            }
        }
        return overallHandValue;             // returns the sorted arraylist
    }

    public int getBestNumericalHandValue() {

        int bestHandValue;
        ArrayList<Integer> numericalHandValues = new ArrayList<Integer>();
        ArrayList<Integer> allowedNumericalHandValues = new ArrayList<Integer>();
        int stopIndex = 0;
        boolean beenHere = false;

        numericalHandValues = this.getNumericalHandValue();

        if (numericalHandValues.get(0) >= 21){
            return numericalHandValues.get(0);
        }

        if (numericalHandValues.size() == 1){
            return numericalHandValues.get(0);
        }

        for (int i = 0; i < numericalHandValues.size(); i++) {
            if (numericalHandValues.get(i) <= 21){
                allowedNumericalHandValues.add(numericalHandValues.get(i));
            }
        }



        bestHandValue = allowedNumericalHandValues.get(allowedNumericalHandValues.size()-1);

        /*
        if (numericalHandValues.size() == 1){
            return numericalHandValues.get(0);
        }

        if (numericalHandValues.size() == 2) {
            for (int i = 0; i < numericalHandValues.size(); i++) {
                if (numericalHandValues.get(i) > 21) {
                    stopIndex = i;
                    beenHere = true;
                }
            }
        }

        if (numericalHandValues.size() >= 2) {
            for (int i = 0; i < numericalHandValues.size(); i++) {
                if (numericalHandValues.get(i) > 21 && beenHere == false) {
                    stopIndex = i;
                    beenHere = true;
                }
            }
        }

        bestHandValue = numericalHandValues.get(stopIndex-1);

         */

        return bestHandValue;
    }

    public ArrayList<Card> getCards() {
        return cardsInHand;
    }

    public int getHandSize() {
        return (handSuits.size());

    }
}
