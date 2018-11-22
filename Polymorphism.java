package raj;
class Sum
{
	int a,b,c,d;
	void add(int a, int b)
	{
		d=a+b;
		System.out.println(d);
	}
	void add(int a,int b,int c)
	{
		d=a+b+c;
		System.out.println("sum3 "+d);
	}
	void add(int a,double x)
	{
		double d=a+x;
		System.out.println("double"+d);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Sum obj=new Sum();
		obj.add(3, 9,12);

	}

}
