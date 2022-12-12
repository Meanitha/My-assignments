package week7.day2;

public class Calculator {
	

	public void add(int a,int b) {
		int c=a+b;
		System.out.println("add method 1");
		System.out.println(c);
		}
	public void add(int a,int b,int c) {
			int d=a+b+c;
			System.out.println("add method 2");
			System.out.println(d);
	}
	public void subtract(int a,int b) {
		int c=a+b;
		System.out.println("subtract method 1");
		System.out.println(c);
	}
	public void subtract(double a,double b) {
		double c=a+b;
		System.out.println("subtract method 2");
		System.out.println(c);
	}
	public void multiply(int a,int b) {
		int c=a*b;
		System.out.println("multiply method 1");
		System.out.println(c);
	}
	public void multiply(int a,double b) {
		double c=a*b;
		System.out.println("multiply method 2");
		System.out.println(c);
	}
	public void divide(int a,int b) {
		int c=a/b;
		System.out.println("divide method 1");
		System.out.println(c);
	}
	public void divide(double a,int b) {
		double c=a/b;
		System.out.println("divide method 2");
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj=new Calculator();

obj.add(20, 30);
obj.add(20, 30, 48);
obj.multiply(20, 5);
obj.multiply(30, 21.5);
obj.subtract(50, 30);
obj.subtract(45.7,38.4);
obj.divide(69, 3);
obj.divide(67.9, 4);
	}

}
