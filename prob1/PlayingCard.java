package labproject4.prob1;

public class PlayingCard {
	
	    // Instance variables and constants:
	    private int _value;   // value ranges from 1-13
	    private String _suit; // is one of: "Clubs", "Diamonds", "Hearts", "Spades"
		private int setValue;
	    public static final int CLUBS = 1;
	    public static final int DIAMONDS = 2;
	    public static final int HEARTS = 3;
	    public static final int SPADES = 4;

	    // Constructors:
	    // 1 - Add a constructor that takes an int value and an int suit
	    //     as input parameters to set the PlayingCard _value and _suit.
	    //     Use the setValue and setSuit methods in the constructor.
	    //     **HINT**: Complete the setValue and setSuit methods below first,
	    //               then this constructor.
	    //               Use no if statements.
	    /**
	     * Constructor
	     * @param value, an int
	     * @param suit, an int
	     */
	    public PlayingCard(int value, int suit) {
	    	setValue(value);
	    	setSuit(suit);
	    }
	    	    
	    // Methods:
	    // 2 - Add a method called setValue to set the PlayingCard _value from a value
	    //     input parameter.
	    //     Add code to ensure that only valid card values will be set (1-13).
	    //     An invalid value should trigger an output statement: "Invalid card value!"
	    //     An 'if - else' structure is required.
	    /**
	     * Set PlayingCard value
	     * @param value, an int
	     */
	    
	    public void setValue(int value) {
	    	if(value >=1 && value <= 13) {
	    		this._value = value;
	    	}else {System.out.println("Invalid card value!");
	    		}
	    }
	    
	    

	    // 3 - Add a method called setSuit to set the PlayingCard _suit from a suit
	    //     input parameter. The suit input parameter is an int.
	    //     If suit = CLUBS, set _suit to "Clubs",
	    //     if suit = DIAMONDS, set _suit to "Diamonds" ... and so on.
	    //     Add code to ensure that only valid suit values (1-4) are used.
	    //     An invalid suit should trigger an output statement: "Invalid card suit!"
	    //     An 'if - else if - else' structure is required.
	    /**
	     * Set PlayingCard suit
	     * @param suit, an int
	     */
	    
	    public void setSuit(int suit) {
	    	if(suit == CLUBS) {
	    		this._suit = "Clubs";
	    	}else if(suit == DIAMONDS) {
	    		this._suit = "Diamonds";
	    	}else if(suit == HEARTS) {
	    		this._suit = "Heats";
	    	}else if(suit == SPADES) {
	    		this._suit = "Spades";
	    	}else {
	    		System.out.println("Invalid card suit!");
	    	}	
	    }

	    
	    
	    
	    
	    
	    // 4 - Add a method called toString to return a String containing the PlayingCard's
	    //     _value and _suit in the form "_value of _suit", e.g.,
	    //     "2 of Clubs" or "Queen of Hearts".
	    //     Some values must be translated to a name:
	    //           if _value = 1, "Ace",
	    //           if _value = 11, "Jack",
	    //           if _value = 12, "Queen",
	    //           if _value = 13, "King.
	    //     An 'if - else if - else' structure is required.
	    /**
	     * Return PlayingCard's _value and _suit as a String
	     * @return PlayingCard as "_value of _suit"
	     */
	    public String toString() {
	    	String newValue = null;
	    	if(_value == 1) {
	    		newValue = "Ace";
	    		return  newValue + " of " + _suit;
	    	}else if(_value == 11) {
	    		newValue = "Jack";
	    		return  newValue + " of " + _suit;
	    	}else if(_value == 12) {
	    		newValue = "Queen";
	    		return  newValue + " of " + _suit;
	    	}else if(_value == 13) {
	    		newValue = "King";
	    		return  newValue + " of " + _suit;
	    	}else return  _value + " of " + _suit;
	    	
			
	    }

		
	    	


	    
	    
	    
	    
} // end of class PlayingCard


	



