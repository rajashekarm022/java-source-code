class Div
	{
	int a;
	int b;

	void setData(int x,int y)
	{
	a=x;
	b=y;
	}
	
	void DivOfTwoNumbers()
	{
	
	System.out.println("div is"+(a/b));
	}
	}
class TestDiv
	{
	public static void main(String args[])
	{
	
		Div obj=new Div();
		obj.setData(100,20);
		obj.DivOfTwoNumbers();
	}
	}
