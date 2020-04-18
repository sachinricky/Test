import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
	
		//  factorial
		//	int x=sc.nextInt();
		//    double fact =1;			
		//		for(int i=x; i>=1;i--) {
		//			fact=fact*i;
		//			System.out.println(i +" x " +i+ " = "+fact);
		//		}System.out.println("type 1 = "+fact);
		//    
									//Fibbonacci 0 1 1 2 3 5 8 13....... 
									
									//	int n =sc.nextInt();
									//		int a=0;
									//		int b=1;
									//		System.out.print(a+" ");
									//		System.out.print(b+" ");
									//		System.out.println();
									//		
									//		for(int i=0;i<n-2; i++) {
									//			int c=a+b;
									//			System.out.print(" C = "+c+" ");
									//	//		System.out.print(" A = " + a + " +  B = " + b); // to check no. swap
									//			a=b;
									//			b=c;
									//	//		System.out.println();
									//			}
//power (2)^3 = 8
/*	
	int a= sc.nextInt();
	int b= sc.nextInt();
	int result = 1;
	for (int i=0; i<b; i++) {
		result *=a;
	}
	 System.out.println(result); */
	
	
//Prime NO.
	
	int x=sc.nextInt();
	boolean isPrime = true; 
	String s=new String();
	s="Prime NO";
		 for(int i=2; i*i <= x; i++){ //factorial of any Number is between No. and its root i*i  
		//for(int i=2; i < x; i++) { 
				 if(x % i == 0) {
					isPrime = false;
					s="Not Prime";
					break;
				 } //System.out.println(i);
			}
		if(x<2) isPrime=false; 
		//{ System.out.println("* 0 and 1 is Not Prime, Smallest prime no is 2 *"); }
		//else 
			System.out.println( x+ " Prime = "+isPrime + s);
	
	
	}//main close
}//class close