package labproject3.prob1;

public class SumOfDice {
private int[] occurrences = new int[13];
	
	public int[] getSimulatedResults() {
		return occurrences;
	}
	
	public void runSimulation() {
		for(int i=0; i<100; i++) {
			int roll1 = rollDice();
			int roll2 = rollDice();
			
			//sum up both rolls, and increment the current value of occurences.
			int sum =roll1 + roll2;
			// occurrences[sum]++;
			occurrences[sum]++;
		}
	}
	
	private int rollDice() {
		int max = 6;
		int min = 1;
		int range = max - min + 1;
		
		int result = (int) (Math.random() * range) + min;
		
		return result;
	}
}


	
