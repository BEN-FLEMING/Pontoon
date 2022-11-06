package src;

import java.util.ArrayList;

public class Pontoon extends CardGame {

    public Pontoon(int nplayers) {
        super(nplayers);
        for (int i = 0; i < nplayers; i++) {
            playerArray[i] = new Player("player_" + i);
        }
    }

    public void dealInitialCards(){
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < 2; j++) {
                playerArray[i].dealToPlayer(playingDeck.dealRandomCard());
            }
        }
    }

    public int compareHands(Player hand1, Player hand2){

        int hand1Rank = 10;
        int hand2Rank = 10;
        int hand1Comparison = 0;
        int hand2Comparison = 0;

        if (hand1.getBestNumericalHandValue() > 21){
            hand1Rank = 11;
        }

        if (hand2.getBestNumericalHandValue() > 21){
            hand2Rank = 11;
        }

        if (hand1Rank == 11 && hand2Rank == 11){
            return 0;
        }

        if (hand1Rank > 10 && hand2Rank == 10){
            return 1;
        }

        if (hand1Rank == 10 && hand2Rank > 10){
            return -1;
        }

        if (isPontoon(hand1)){
            hand1Rank = 1;
        }

        if (isPontoon(hand2)){
            hand2Rank = 1;
        }

        if (hand1Rank == 1 && hand2Rank == 1){
            return 0;
        }

        if (hand1Rank > 1 && hand2Rank == 1){
            return 1;
        }

        if (hand1Rank == 1 && hand2Rank > 1){
            return -1;
        }

        if (isFiveCardTrick(hand1)){
            hand1Rank = 2;
        }

        if (isFiveCardTrick(hand2)){
            hand2Rank = 2;
        }

        if (hand1Rank == 2 && hand2Rank == 2){
            return 0;
        }

        if (hand1Rank > 2 && hand2Rank == 2){
            return 1;
        }

        if (hand1Rank == 2 && hand2Rank > 2){
            return -1;
        }

        if(hand1.getBestNumericalHandValue() == 21){
            hand1Rank = 3;
        }

        if(hand2.getBestNumericalHandValue() == 21){
            hand2Rank = 3;
        }

        if (hand1Rank == 3 && hand2Rank == 3){
            return 0;
        }

        if (hand1Rank > 3 && hand2Rank == 3){
            return 1;
        }

        if (hand1Rank == 3 && hand2Rank > 3){
            return -1;
        }

        if (hand1.getBestNumericalHandValue() <= 20){
            hand1Comparison = hand1.getBestNumericalHandValue();
        }

        if (hand2.getBestNumericalHandValue() <= 20){
            hand2Comparison = hand2.getBestNumericalHandValue();
        }

        if (hand1Comparison == hand2Comparison){
            return 0;
        }

        if (hand1Comparison > hand2Comparison){
            return -1;
        }

        if (hand1Comparison < hand2Comparison){
            return 1;
        }

        return 0;
    }

    public boolean isPontoon(Player hand) {      //returns true if the hand is pontoon

        int aceCounter = 0;
        int tenCounter = 0;

        for (int b = 0; b < hand.handValues.size(); b++) {
            switch (hand.handValues.get(b)) {
                case ACE:
                    aceCounter++;
                    break;
                case TWO:
                    break;
                case THREE:
                    break;
                case FOUR:
                    break;
                case FIVE:
                    break;
                case SIX:
                    break;
                case SEVEN:
                    break;
                case EIGHT:
                    break;
                case NINE:
                    break;
                case TEN:
                    tenCounter++;
                    break;
                case JACK:
                    tenCounter++;
                    break;
                case QUEEN:
                    tenCounter++;
                    break;
                case KING:
                    tenCounter++;
                    break;
                default:

            }
        }
        if (aceCounter == 1 && tenCounter == 1){
            return true;
        }
        return false;
    }

    public boolean isFiveCardTrick(Player hand){

        ArrayList<Integer> fiveCardTrickTest = new ArrayList<Integer>();
        int numberInHand = 0;

        fiveCardTrickTest = hand.getNumericalHandValue();

        numberInHand = hand.cardsInHand.size();

        for (int i = 0; i < fiveCardTrickTest.size(); i++) {
            if (fiveCardTrickTest.get(i) < 21 && numberInHand >=5)
                return true;
        }
        return false;
    }

}
