import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		
		 //importing  scanner to get the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows :");
        int M= sc.nextInt();

        System.out.println("No. of column : ");
        int N= sc.nextInt();
        //2D array
        int arr[][]=new int[M][N];

        //loop fuction to print multiple value at once
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
