class Mul
	{
	int a;
	int b;
	void setData(int x,int y)
	{
	a=x;
	b=y;
	}
	
	void MulOfTwoNumbers()
	{
	
	System.out.println("mul is"+(a*b));
	}
	}
class TestMul
	{
	public static void main(String args[])
	{
	
		Mul obj=new Mul();
		obj.setData(100,20);
		obj.MulOfTwoNumbers();

	}
	}
