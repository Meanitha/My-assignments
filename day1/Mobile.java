package week1.day1;

public class Mobile
{
         public void makecall()
            {
        	 
              String mobileModel="oppo";
              float mobileWeight=228.05f;  
              System.out.println("my mobile model is  "+mobileModel);
              System.out.println("my mobile weight is  "+mobileWeight);
            }
         public void sendMsg()
         
           {
	          
        	 Boolean isMobileFullCharge=true;
        	 int mobileCost=29555;
        	 System.out.println("is my mobile fully charged  "+isMobileFullCharge);
        	 System.out.println("my mobile price is  "+mobileCost);		 
          }
 public static void main(String[] args) 
 {
	 Mobile phone = new Mobile();
	 
	 
	 System.out.println("This is my mobile");
	 phone.makecall();
	 phone.sendMsg();
	 
}
}
