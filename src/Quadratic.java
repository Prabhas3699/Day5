import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		//using scanner to get user input	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Value a = ");
	int a=sc.nextInt();
	System.out.println("Enter the Value b = ");
	int b=sc.nextInt();
	System.out.println("Enter the Value c = ");
	int c=sc.nextInt();
	//formulae	
	double d=b*b - 4*a*c;
	System.out.println("delta = "+d);
	
	if(d>0) {	
		double root1=(-b + Math.sqrt(d))/(2*a);
		System.out.println("Root 1 of X = "+root1);
		double root2=(-b - Math.sqrt(d))/(2*a);
		System.out.println("Root 2 of X = "+root2);
	}else {
		System.out.println("delta value is negative.");
	}
	}

}
