import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		// Pattern 1
		System.out.println("---------------Pattern 1-------");
		 for(int j=1; j<=i;j++ ) { for(int b=1; b<=j; b++) { System.out.print("* "); }
		  System.out.println(); }
		  
		 
		// Pattern 2
		 System.out.println("--------------Pattern 2-------");
		for (int j = 1; j <= i; j++) {
			for (int b = i; b >= j; b--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Patern 3
		System.out.println("---------------Pattern 3-------");

	}
}
