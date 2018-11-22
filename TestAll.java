class Arithmetic
	{
	int a;
	int b;

	void setData(int x,int y)
	{
	a=x;
	b=y;
	}
	
	void ArthmeticOperationsOfTwoNumbers()
	{
	
	System.out.println("sum is"+(a+b));
	System.out.println("sub is"+(a-b));
	System.out.println("mul is"+(a*b));
	System.out.println("div is"+(a/b));
	}
	}
class TestAll
	{
	public static void main(String args[])
	{
	
		Arithmetic obj=new Arithmetic();
		obj.setData(100,20);
		obj.ArthmeticOperationsOfTwoNumbers();

	}
	}
