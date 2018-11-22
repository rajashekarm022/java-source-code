package raj;
class T
{
	T(char ch)
	{
		System.out.println("T is class constructor and value is : "+ch);
	}
}
class U extends T
{
	U(String s,char ch)
	{
		super(ch);
		System.out.println("U is class constructor and value is :"+s);
		
	}
}
class V extends U
{
	V(int x,String s,char ch)
	{
		super(s,ch);
		System.out.println("V is class constructor and value is : "+x);
		
	}
}
public class Multilevel1 {

	public static void main(String[] args) {
	
V obj=new V(5,"abc",'d');
	}

}
