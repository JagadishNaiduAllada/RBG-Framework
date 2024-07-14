package nikki;

public class nikki
{
   public static void main(String[] args)
	{
	   nikki x = new nikki();
	   x.demoA(10 , 20);
	   x.demoB();
	   x.demoC(50, 50);
	   x.demoD();
	   x.demoE(20, 30);
	  
	 
	   }
	   int demoA(int a,int b)
	   {
		int c = a+b;
	    System.out.println(c);
	   return 1;
	   }
	   long demoB()
	   {
	   long a = 5000;
	   long b = 5000;
	   long c = a+b;
	  System.out.println(c);
	   return 10000;
	   }
	   float demoC(float a,float b)
	   {
	   float c = a+b;
	   System.out.println(c);
	   return 1;
	   }
	   double demoD()
	   {
		double a = 7.123456;
		double b = 7.123456;
		double c = a+b;
	    System.out.println(c);
	   return 1.0;
	   }
	   void demoE(int a,int b)
	   {
		 int c = a+b;
		 System.out.println(c);
	      }
	   
		}
	  
	   

	 
	  
	   	  

	



 