package helloWorld;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner; //imports the Scanner class

/**
 * Lab1 reads in a file (data.txt) and returns
 * the number of tokens that are doubles, the 
 * number of tokens which are not doubles and
 * the total sum of the numbers (doubles). 
 * @author adrianapadilla
 * 
 */
public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;//check if null is needed
		try{
			in = new Scanner(new File("data.txt"));
		}catch (Exception FileNotFoundException) {
			System.err.println("failed to open data.txt");
			System.exit(1);
		}//catch
		int countDoubles = 0, countNonDbls = 0;
		double d = 0;
		while(in.hasNext()) {
			String token = in.next();
			if(new Scanner(token).hasNextDouble()) {
				countDoubles++;
				d += Double.parseDouble(token);
				
			}else{
				countNonDbls++;
			}//ends else
		}//ends while
		
		DecimalFormat df = new DecimalFormat("#.0");
		//df.setMaximumFractionDigits(1);
		System.out.println(countDoubles + " " + countNonDbls + " " + df.format(d));
		
		in.close();
	}//ends main

}//ends class Lab1
