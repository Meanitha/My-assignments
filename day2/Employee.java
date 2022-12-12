package week7.day2;

public class Employee {

int idno;
String name;

	
	public Employee() {
		
		System.out.println("inside thr Employee constructor");
	}
	
	public Employee(int idno, String name) {
		
		this.idno=idno;
		this.name=name;
	}
	public static void main(String[] args) {
		System.out.println("before obj");
Employee obj=new Employee(1111,"anitha");
System.out.println(obj.idno);
System.out.println(obj.name);
	}

}