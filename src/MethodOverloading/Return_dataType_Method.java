package MethodOverloading;

public class Return_dataType_Method {
    static int grossSalary = 100000;
	public static void main(String[] args) {
		int netSalary = grossSalary - expenses(10000,15000,30000,25000);
		System.out.println(netSalary);

	}
	static int expenses(int rent,int fees,int bills,int others)
	{
	 int totalCharges = rent + fees + bills + others;
		
		return totalCharges;
	}

}
