package week7.day2;

public class OverLoading {
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
public void add(int a, int b,int c) {
		int d=a+b-c;
		System.out.println(d);
	}
public void add(String name) {
	System.out.println("anitha");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverLoading obj=new OverLoading();
obj.add(null);
obj.add(10, 20);
obj.add(40, 30, 10);
	}

}
