package src;

abstract class CardGame {

    int numberOfPlayers;
    Deck playingDeck;
    public Player[] playerArray;

    public CardGame(int nplayers){
        this.playingDeck = new Deck();
        this.numberOfPlayers = nplayers;
        this.playerArray = new Player[nplayers];
    }

    public abstract void dealInitialCards();

    public abstract int compareHands(Player hand1, Player hand2);

    public Deck getDeck(){
        return this.playingDeck;
    }

    public Player getPlayer(int i){
        return playerArray[i];
    }

    public int getNumPlayers(){
        return this.numberOfPlayers;
    }

}
