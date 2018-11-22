package raj;
class R
{
	R(int x)
	{
		System.out.println("A class constructor is:"+x);
	}
}
class S extends R
{
	S(char y, double z,int x)
	{
		super(x);
		System.out.println("B class constructor is: char "+y);
		System.out.println("B class constructor is: double "+z);
	}
}
public class Singlelevel1 {

	public static void main(String[] args) {
		S obj=new S('a',22.22,5);

	}

}
