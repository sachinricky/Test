
//main class
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAin CLass");
		
		Child1 c1= new Child1();
		c1.run();
		
		Child2 c2=new Child2();
		c2.run();
	}
}


//class1
class Child1{
	public void run() {
		int i=10;
		int j=12;
		int k=i+j;
		
		 System.out.println("child1 "+k);
	}
}


//class2
class Child2{
	public void run() {
		int i=10;
		int j=12;
		int k=i+j;
		
		 System.out.println("child2 "+k);		
	}
}