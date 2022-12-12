package week7.day2;

public class AxisBank extends BankInfo{
	
	
	public void deposit()
	{
		System.out.println("this is my axis deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank obj=new AxisBank();
obj.saving();
obj.fixed();
obj.deposit();
	}

}
