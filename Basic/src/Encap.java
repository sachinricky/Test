class Employee{
	private int empId;  //private variable "Data Hiding"
	
	public void setEmpId(int eId){
		empId=eId;
		
	}
	
	public int getEmpId() {
		  return empId;
	}
	
}

public class Encap {

	public static void main(String args[]) {
		Employee e =new Employee();
		
		e.setEmpId(100);                               //setting Value to SetEmpId method in Employee class
		//e.getEmpId();
		
		System.out.println(e.getEmpId());               //fetching value of empId private method 
		
	}
}
