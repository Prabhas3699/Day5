
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
//		int a = 5;
//		int b = 6;
//		int c = 7;
		
		int a = (int)((Math.random()*10) + 1);	
		int b = (int)((Math.random()*10) + 1);
		int c = (int)((Math.random()*10) + 1);
		
		
		if(a>b && a>c) {
			System.out.print("a ="+ a + "  ");
			System.out.println("Largest Number is a");
		}else if(b>a && b>c){
			System.out.print("b ="+ b + "  ");
			System.out.println("Largest Number is b");
		}else {
			System.out.print("c ="+ c + "  ");
			System.out.println("Largest Number is c");
		}

	}

}
