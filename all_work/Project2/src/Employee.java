//making changes in branch1
public class Employee {

	int id;
	int b_salary;
	String name;
	
	static int ctr=100;
	
	public Employee(){
		ctr++;
		id=789;
		b_salary=50000;
		name="Purbita";
		System.out.println("Default constructor");
				
		
		
	}
	
	public Employee (int aid,int sal,String Name){
		ctr++;
		id=aid;
		b_salary=sal;
		name=Name;
		System.out.println("Parameterized constructor");
	}
	
public void showCtr() {
		
		System.out.println("No. of objects of employee type: "+ctr);
	}
	
	public void setData(int i,String n,int b) {
		
		id=i;
		name=n;
		b_salary=b;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public String getNn() {
		return name;
	}
	
	public int getSal() {
		return b_salary;
	}
	
	/*public void displayData() {
		
		System.out.println("Id & Salary of "+name+ " is "+id+" & "+b_salary);
	}*/
	
	void employeeDetail() {
		System.out.println(id);
		System.out.println(b_salary);
		System.out.println(name);
	}
	
	
}
