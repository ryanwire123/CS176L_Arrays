package labproject2.prob1;
public class WeeklyTemps {
	double largest;
	double smallest;
	
	//creating the getMax method to find the largest temperature
	public double getMax(double [] temps) {
		largest = temps[0];
		for (int i = 0; i < temps.length; i++) {
			if(temps[i] > largest) {
				largest = temps[i];
			}
		}return largest;
	}
	
	
	//creating the getMin method to find the smallest temperature
	public double getMin(double [] temps) {
		smallest = temps[0];
		for (int i = 0; i < temps.length; i++) {
			if(temps[i] < smallest) {
				smallest = temps[i];
			}
		}return smallest;
	}
	
	//creating the getRangeStr method to find the range of temperatures
	public String getRangeStr(double[] temps) {
		double min = getMin(temps);
		double max = getMax(temps);
		String range = String.format("%.1f - %.1f", min, max);
		 return range;	
	}
	
	//creating the getMean method to find the mean temperature
	public double getMean(double [] temps) {
		double sum = 0;
		for(int i = 0; i < temps.length; i++) {
			sum = temps[i] + sum;
		}
		double mean = sum/(temps.length-1);
		return mean;
	}
	
	//creating the getExtreme method to find the number of extreme days
	public int getExteme(double [] temps) {
		int days = 0;
		for(int i = 0; i < temps.length; i++) {
			if(temps[i] >= 95 || temps[i] <= 5) {
				days = days + 1;
			}
		}return days;	
	}
}


