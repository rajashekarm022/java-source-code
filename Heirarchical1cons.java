package raj;
class M
{
	M(String s)
	{
		System.out.println("M is class constructor and value is: "+s);
	}
}
class N extends M
{
	N(String s)
	{
		super(s);
	}
}
class O extends N
{
	O(int x,String s)
	{
		super(s);
		System.out.println("N is class constructor and value is : "+x);
	}
}
class P extends N
{
	P(double d,String s)

	{
		super(s);
		System.out.println("O is class Constructor and value is: "+d);
	}
}
public class Heirarchical1cons {

	public static void main(String[] args) {
		O obj1=new O(5,"raj");
		P obj2=new P(22.22,"raju");

	}

}
