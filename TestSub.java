class Sub
	{
	int a;
	int b;

	void setData(int x,int y)
	{
	a=x;
	b=y;
	}
	
	void SubOfTwoNumbers()
	{
	
	System.out.println("sub is"+(a-b));
	}
	}
class TestSub
	{
	public static void main(String args[])
	{
	
		Sub obj=new Sub();
		obj.setData(100,20);
		obj.SubOfTwoNumbers();

		obj.setData(85,80);
		obj.SubOfTwoNumbers();
	}
	}
