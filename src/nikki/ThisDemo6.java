package nikki;

public class ThisDemo6
{
  ThisDemo6()
  {
	  this(10);
	  System.out.println("Constructor chaining is done");
  }
  ThisDemo6(int a)
  {
	  System.out.println("Constructor chaining ");
  }
	public static void main(String[] args) 
	{
		ThisDemo6 x = new ThisDemo6();
		

	}

}
