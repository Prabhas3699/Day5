import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		
		 int num=0;
		 int i = 1;
	     double mean = 0.0;

	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the number for length of series");
	        num = in.nextInt();

	        while (i <= num) {
	            System.out.print("1/" + i + " +");
	            mean = mean + (double) 1 / i;
	            i++;
	        }System.out.println("\n\nSum of Harmonic Series mean value is " + mean);
	}

}
