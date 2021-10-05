package labproject2.prob1;
import java.util.Scanner;
public class TestWeeklyTemps {

	public static void main(String[] args) {
		int currentSize = 0;
		//import a scanner
		Scanner in = new Scanner(System.in);
		//declare the array
		double [] temps = new double[7];
		System.out.println("Input a temperature for each day of the week then press q to run program");
		while(in.hasNextDouble() && currentSize < temps.length){
			temps[currentSize] = in.nextDouble();
			currentSize++;
			
		}
		
		WeeklyTemps LastWeek = new WeeklyTemps();
		System.out.println("Weekly temperature data (degrees F): ");
		System.out.print("mean: ");
		System.out.printf("%.1f\n",LastWeek.getMean(temps));
		System.out.print("range: ");
		System.out.println(LastWeek.getRangeStr(temps));
		System.out.print("extreme temp days: ");
		System.out.println(LastWeek.getExteme(temps));    
		}
	
}


