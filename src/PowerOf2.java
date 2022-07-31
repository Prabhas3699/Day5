
public class PowerOf2 {

	public static void main(String[] args) {
		
		int n=64;
		int N=0;
		int i=0;
		boolean power = false;
		
		for(i=0; i<n; i++) {
			i=(int)(Math.pow(2, N));
			N++;
			System.out.print("2^"+ N + " + ");
			
			if(i == n) {
				power=true;
			}
		}if (power == true) {
			System.out.println("\n\nThe power of 2 is True");
		}else {
			System.out.println("\n\nThe power of 2 is false");
		}


	}

}
