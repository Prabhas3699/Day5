import java.util.Scanner;
public class WindChill {
	public static void main (String [] args) {
		//using scanner to get user input
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the value of t:");
		double t=sc.nextDouble();
		System.out.println("Enter the value of v:");
		double v=sc.nextDouble();
		
		System.out.println("t = "+t +"F" );
		System.out.println("v = "+v+"mph");
		//formula
		double w=35.74+0.6215*t+(0.4275*t - 35.75) *Math.pow( v, 0.5);
		System.out.println("Wind chill = "+ w);
	}

}
