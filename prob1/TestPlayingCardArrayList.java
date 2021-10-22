package labproject4.prob1;
import java.util.ArrayList;
public class TestPlayingCardArrayList {

	public static void main(String[] args) {
		// 1 - Construct an array of 52 PlayingCard objects called deck.
				ArrayList<PlayingCard> deck = new ArrayList<>();



			        // 2 - Construct the 52 PlayingCards in a standard deck of cards
			        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
			        //     and add them to the deck. You must use a loop (or
			        //     nested loops).
					//value: 1-13
					//suit: 1-4
					
					//suit loop i = suit
					for(int suit=1; suit<=4; suit++) {
			    		//value loop
			    		for(int value=1; value<=13; value++) {
			    			PlayingCard pc = new PlayingCard(value, suit);
			    			deck.add(pc);
			    		}
			    	}

			        



			        // 3 - Display the value and suit of every PlayingCard in the deck.
			        //     You must use a loop.
					for(PlayingCard pc : deck) {
						System.out.println(pc); //implement toString() in PlayingCard first for this to work
					}
			        

			        

			    }
			


	}


