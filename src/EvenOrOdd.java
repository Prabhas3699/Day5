
public class EvenOrOdd {

	public static void main(String[] args) {
		
		int i = (int)((Math.random()*10) + 1);
		
		if (i%2==0) {
			System.out.println(i);
			System.out.println("The Number is even");
		}else {
			System.out.println(i);
			System.out.println("The Number is odd");			
		}

	}

}
