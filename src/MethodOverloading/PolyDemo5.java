package MethodOverloading;

public class PolyDemo5 
{

	public static void main(String[] args) 
	{
		PolyDemo5 x = new PolyDemo5();
		M n = new M();
		`x.funA(n);
		O p = new O();
        x.funB(p);
        x.funC(new Q());
	}
public void funA(A a1)
{
	System.out.println(a1);
}
public void funA(B b1)
{
	System.out.println(b1);
}
public void funA(C c1)
{
	System.out.println(c1);
}

}
