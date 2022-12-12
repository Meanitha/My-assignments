package week7.day2;

public class ChildClass extends LearnSuper {

	public void childClass() {
		super.detail();
		System.out.println("child class");
		
	}
	public void print() {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.cmpname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildClass obj=new ChildClass();
obj.print();
	}

}
