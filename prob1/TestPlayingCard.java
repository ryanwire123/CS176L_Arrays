package labproject4.prob1;

public class TestPlayingCard {

	public static void main(String[] args) {
		{
	        // 1 - Construct an array of 52 PlayingCard objects called deck.
			PlayingCard[] deck = new PlayingCard[52];




	        // 2 - Construct the 52 PlayingCards in a standard deck of cards
	        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
	        //     and add them to the deck. You must use a loop (or
	        //     nested loops).
			//value: 1-13
			//suit: 1-4
			
			int counter = 0;
			//suit loop i = suit
			for(int suit = 1; suit <= 4; suit++) {
				//value loop 
				for(int value = 1; value <= 13; value++) {
					PlayingCard pc = new PlayingCard(value, suit);
					deck[counter] = pc;
					counter++;
				}
			}

	        



	        // 3 - Display the value and suit of every PlayingCard in the deck.
	        //     You must use a loop.
			for(PlayingCard pc : deck) {
				
				System.out.println(pc); //implement toString() in PlayingCard first for this to work
			}
	        

	        

	    }
	}


}


