package Javademo;

public class Employee {
	
	int empid;
	String empName;
	String city;
	

	public Employee(int empid, String empName, String city) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"Ram","Hyderabad");
		Employee emp1=new Employee(102,"Supreet","Chennai");
		Employee emp2=new Employee(103,"Tarun","Bangalore");
	System.out.println(emp);
	System.out.println(emp1);
	System.out.println(emp2);
	}


	
		
	}
	

