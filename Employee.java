package helloworld.assignment;

public class Employee {
	
	public int empid;
	public String empname;
	public int empsal;
	private int salcal;
	
	public void display() {
		
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
	}
	public void salcal() {
		salcal= empsal-2000;
		System.out.println(salcal);
		
	}
	public class manager extends Employee{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public class developer extends Employee{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public class tester extends Employee{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public static void main(String[] args) {
		 Employee emp = new Employee();
		 tester tes=emp.new tester();
		 emp.empid=1231;
		 emp.empname="sai";
		 emp.empsal=20000;
		 emp.salcal();
		 emp.display();
		 
		
	}

}
