package nikki;

public class ThisDemo1 
{
	int a =10;
	int b = 20;
	
	ThisDemo1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args)
	{
		ThisDemo1  x = new ThisDemo1(15,30);
		System.out.println(x.a);
		System.out.println(x.b);
		

	}

}
