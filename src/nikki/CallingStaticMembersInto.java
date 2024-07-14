package nikki;

public class CallingStaticMembersInto
{
	static CallingStaticMembersInto x = new CallingStaticMembersInto();

	public static void main(String[] args)
	{
		CallingStaticMembersInto x = new CallingStaticMembersInto();
	}
	void funA()
	{
		CallingStaticMembersInto x = new CallingStaticMembersInto();
	}
	
	void funB()
	{
	CallingStaticMembersInto x = new CallingStaticMembersInto();
	x.funA();
	}
	}
	
		
	
