package week7.day2;

public class ConstructorChain {

	
		public ConstructorChain() 
		{
	        this(1011);
	        System.out.println("default Constructor");
	        
	    }
	    public ConstructorChain(int id) 
	    {
	        this(34.56f);
	    System.out.println("first Constructor");
	   }
	    public ConstructorChain(String name) 
	    {
	        
	        System.out.println("Second Constructor");
	    
	    }
	       ConstructorChain(float pay)
	       {
	           this("princila");
	        System.out.println("Third Constructor");
	    }
	    
	    public static void main(String[] args)
	    {
	        ConstructorChain obj=new ConstructorChain();
	    }
	

	}


