//DESIGN THE CLASS
class Sum
{
//Two instance variables
int a;
int b;
//method to intialize instance data
	void setData(int x,int y)
	{
	a=x;
	b=y;
	}
	//write a method to add above two numbers
	void SumOfTwoNumbers()
	{
	System.out.println("sum is"+(a+b));
	}
	}
	class TestSum
	{
	public static void main(String args[])
	{
		//INSIDE MAIN()
		Sum obj=new Sum();
		obj.setData(10,20);
		obj.SumOfTwoNumbers();

		obj.setData(40,80);
		obj.SumOfTwoNumbers();
	}
	}
