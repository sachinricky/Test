
class A{
	void abc(Object o) {
		System.out.println("class A");
	}
}

//classMAin
public class Polly extends A {

	void abc(String s) {
		System.out.println("class Polly");
	}
	
	public static void main(String args[]) 
	{
		A a=new A();
		a.abc("abc");
		Polly p=new Polly();
		p.abc("abc");
	}
}
