package nikki;

public class ThisDemo2 
{
	ThisDemo2()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		ThisDemo2 x = new ThisDemo2();
		System.out.println(x);

	}

}
