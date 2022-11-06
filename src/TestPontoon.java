package src;

public class TestPontoon {

	public static void main(String[] args) {

		Deck startDeck = new Deck();
		Player playerOne = new Player("Jerome");
		Player playerTwo = new Player("Bobson");
		Card testCard = new Card(Card.Suit.HEARTS, Card.Value.ACE);
		Card testCardTwo = new Card(Card.Suit.CLUBS, Card.Value.TEN);
		Card testCardThree = new Card(Card.Suit.DIAMONDS, Card.Value.EIGHT);
		Card testCardFour = new Card(Card.Suit.HEARTS, Card.Value.TEN);
		Card testCardFive = new Card(Card.Suit.SPADES, Card.Value.THREE);
		Card testCardSix = new Card(Card.Suit.DIAMONDS, Card.Value.TEN);
		playerOne.dealToPlayer(testCard);
		playerOne.dealToPlayer(testCardTwo);
		playerTwo.dealToPlayer(testCardTwo);
		int comparisonMetric;
		/*

		System.out.println("The cards in the deck are: ");
		for (Card printCard : startDeck.getCardDeck()) {
			System.out.println(printCard.getCardValue() + " of " + printCard.getCardSuit() + " ");
		}

		startDeck.shuffle();
		System.out.println("The now shuffled cards in the deck are: ");
		for (Card printCard : startDeck.getCardDeck()) {
			System.out.println(printCard.getCardValue() + " of " + printCard.getCardSuit() + " ");
		}

		Card getCardAtIndexTest = startDeck.getCard(51);
		System.out.println("The card at index 52 of the shuffled deck is : " + getCardAtIndexTest.getCardValue() + " of " + getCardAtIndexTest.getCardSuit());

		startDeck.reset();
		System.out.println("The now reset cards in the deck are: ");
		for (Card printCard : startDeck.getCardDeck()) {
			System.out.println(printCard.getCardValue() + " of " + printCard.getCardSuit() + " ");
		}

		getCardAtIndexTest = startDeck.getCard(51);
		System.out.println("The card at index 52 of the reset deck is : " + getCardAtIndexTest.getCardValue() + " of " + getCardAtIndexTest.getCardSuit());

		Card randomDeckCard = startDeck.dealRandomCard();
		System.out.println("The first random card selected from the deck is: " + randomDeckCard.getCardValue() + " of " + randomDeckCard.getCardSuit());

		System.out.println("The deck after the first card has been dealt is comprised of: ");
		for (Card printCardTwo : startDeck.getCardDeck()) {
			System.out.println(printCardTwo.getCardValue() + " of " + printCardTwo.getCardSuit());
		}

		System.out.println("The deck size after the first card has been dealt is: " + startDeck.size());

		Card randomDeckCardTwo = startDeck.dealRandomCard();
		System.out.println("The second random card selected from the deck is: " + randomDeckCardTwo.getCardValue() + " of " + randomDeckCardTwo.getCardSuit());

		System.out.println("The deck after the second  card has been dealt is comprised of: ");
		for (Card printCardThree : startDeck.getCardDeck()) {
			System.out.println(printCardThree.getCardValue() + " of " + printCardThree.getCardSuit());
		}

		System.out.println("The deck size after the second card has been dealt is: " + startDeck.size());

		*/

		/*
		System.out.println("Player One named " + playerOne.getName() + " hand values are: " + playerOne.handValues);
		System.out.println("Player One named " + playerOne.getName() + " hand suits are: " + playerOne.handSuits);
		System.out.println("Player " + playerOne.getName() + "'s hand value is " + playerOne.getNumericalHandValue());
		System.out.println("Player " + playerTwo.getName() + "'s hand value is " + playerTwo.getNumericalHandValue());
		System.out.println("Player " + playerTwo.getName() + "'s best hand value is " + playerTwo.getBestNumericalHandValue());
		System.out.println("Player " + playerTwo.getName() + " has the following cards in their hand: " + playerTwo.getCards());
		System.out.println("Player " + playerOne.getName() + " has this many cards in their hand:" + playerOne.getHandSize());
		System.out.println("Player " + playerTwo.getName() + " has this many cards in their hand:" + playerTwo.getHandSize());

		 */

		Pontoon newGame = new Pontoon(2);

		System.out.println("Playing deck size for new game is: " + newGame.playingDeck.size());

		// newGame.dealInitialCards();

		// newGame.playingDeck.reset();

		System.out.println("Playing deck size for new game is: " + newGame.playingDeck.size());

		newGame.playerArray[0].dealToPlayer(testCard);
		newGame.playerArray[0].dealToPlayer(testCardTwo);
		/*
		newGame.playerArray[0].dealToPlayer(testCardThree);
		newGame.playerArray[0].dealToPlayer(testCardFour);
		newGame.playerArray[0].dealToPlayer(testCardFive);
		*/

		/*
		newGame.playerArray[1].dealToPlayer(testCard);
		newGame.playerArray[1].dealToPlayer(testCardTwo);
		*/
		newGame.playerArray[1].dealToPlayer(testCardThree);
		newGame.playerArray[1].dealToPlayer(testCardFour);
		newGame.playerArray[1].dealToPlayer(testCardFive);
		/*
		newGame.playerArray[1].dealToPlayer(testCardSix);
		 */





		System.out.println("Player One hand values are: " + newGame.playerArray[0].handValues);
		System.out.println("Player Two hand values are: " + newGame.playerArray[1].handValues);




		/*
		System.out.println("The deck after the initial cards have been dealt is comprised of: ");
		for (Card printCardThree : newGame.getDeck().getCardDeck())
			System.out.println(printCardThree.getCardValue() + " of " + printCardThree.getCardSuit());

		 */


		System.out.println("Player One numerical hand values are: " + newGame.playerArray[0].getNumericalHandValue());
		System.out.println("Player Two hand values are: " + newGame.playerArray[1].getNumericalHandValue());

		System.out.println("Player One best hand value is: " + newGame.playerArray[0].getBestNumericalHandValue());
		System.out.println("Player Two best hand value is: " + newGame.playerArray[1].getBestNumericalHandValue());

		System.out.println("Does player 1 have pontoon? " + newGame.isPontoon(newGame.playerArray[0]));
		System.out.println("Does player 2 have pontoon? " + newGame.isPontoon(newGame.playerArray[1]));

		System.out.println("Does player 1 have 5 card trick? " + newGame.isFiveCardTrick(newGame.playerArray[0]));
		System.out.println("Does player 2 have 5 card trick? " + newGame.isFiveCardTrick(newGame.playerArray[1]));

		comparisonMetric = newGame.compareHands(newGame.playerArray[0], newGame.playerArray[1]);

		if (comparisonMetric == 0){
			System.out.println("The game is a DRAW");
		}
		if (comparisonMetric == 1){
			System.out.println("PLAYER TWO WIN");
		}
		if (comparisonMetric == -1){
			System.out.println("PLAYER ONE WIN");
		}

		System.out.println("ROUND 2");

		for (int i = 0; i < newGame.numberOfPlayers; i++) {
			newGame.playerArray[i].dealToPlayer(newGame.playingDeck.dealRandomCard());
		}

		System.out.println("Player One hand values are: " + newGame.playerArray[0].handValues);
		System.out.println("Player Two hand values are: " + newGame.playerArray[1].handValues);

		System.out.println("Player One numerical hand values are: " + newGame.playerArray[0].getNumericalHandValue());
		System.out.println("Player Two hand values are: " + newGame.playerArray[1].getNumericalHandValue());

		System.out.println("Player One best hand value is: " + newGame.playerArray[0].getBestNumericalHandValue());
		System.out.println("Player Two best hand value is: " + newGame.playerArray[1].getBestNumericalHandValue());

		System.out.println("Does player 1 have pontoon? " + newGame.isPontoon(newGame.playerArray[0]));
		System.out.println("Does player 2 have pontoon? " + newGame.isPontoon(newGame.playerArray[1]));

		System.out.println("Does player 1 have 5 card trick? " + newGame.isFiveCardTrick(newGame.playerArray[0]));
		System.out.println("Does player 2 have 5 card trick? " + newGame.isFiveCardTrick(newGame.playerArray[1]));

		comparisonMetric = newGame.compareHands(newGame.playerArray[0], newGame.playerArray[1]);

		if (comparisonMetric == 0){
			System.out.println("The game is a DRAW");
		}
		if (comparisonMetric == 1){
			System.out.println("PLAYER TWO WIN");
		}
		if (comparisonMetric == -1){
			System.out.println("PLAYER ONE WIN");
		}
	}

}
