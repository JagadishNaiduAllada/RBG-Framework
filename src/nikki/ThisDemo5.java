package nikki;

public class ThisDemo5 
{
	int i;
	int j;
	ThisDemo5()
	{
		i = 10;
	}
	
	ThisDemo5(int a)
	{
		this();
		j = a;
	}

	public static void main(String[] args) 
	{
		ThisDemo5 x = new ThisDemo5(15);
		System.out.println(x.i);
		System.out.println(x.j);
		
		ThisDemo5 y = new ThisDemo5(25);
		System.out.println(y.i);
		System.out.println(y.j);
	}

}
