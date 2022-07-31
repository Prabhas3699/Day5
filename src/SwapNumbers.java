
public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		
		System.out.println("---Swap No.---");
		{
		/*int c;
		
		c = a + b;
		b = c - b;
		a = c - a;
		*/
			a=a+b;
			b=a-b;
			a=a-b;
			
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		}

	}

}
