import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		//using scanner to get user input
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the x value:");
		int x=sc.nextInt();
		System.out.println("Enter the y value:");
		int y=sc.nextInt();
		
		//formula
		double distance=Math.sqrt(x*x + y*y);
		System.out.println("Euclidean Distance = "+distance);		
	}

}
