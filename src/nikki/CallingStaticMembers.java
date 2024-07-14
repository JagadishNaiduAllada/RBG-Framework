package nikki;

public class CallingStaticMembers 
{
	static int a=10;
	static int b = 20;
	static void funA()
	{
	 int c = a+b;
	 System.out.println(c);
	}

	public static void main(String[] args) 
	{
		
		System.out.println( a );
		System.out.println( b );
	     funA();
	}

}
 