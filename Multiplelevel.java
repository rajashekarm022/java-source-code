package raj;
class Mobile
{
	String brand="Nokia";
	String platform="Android";
	void mobileData()
	{
		System.out.println("Brand is:"+brand);
		System.out.println("Platform is:"+platform);
	}
}
class Nokia3 extends Mobile
{
	int model=3;
	void nokia3Data()
	{
		System.out.println("Model name is: Nokia"+model);
	}
	
}
class Nokia5 extends Mobile
{
	int model=5;
	void nokia5Data()
	{
		System.out.println("Model name is:Nokia"+model);
	}
}
class Nokia5plus extends Nokia5
{
	float model=5.1f;
	void nokia5plusData()
	{
		System.out.println("Updated version of nokia5 is: Nokia"+model);
	
	}
}
public class Multiplelevel {

	public static void main(String[] args) {
		System.out.println("Mobile1 deatails");
		System.out.println("---------------------");
		Nokia3 obj1=new Nokia3();
		obj1.mobileData();
		obj1.nokia3Data();
		System.out.println("**********************");
		
		System.out.println("Mobile2 deatails");
		System.out.println("---------------------");
		Nokia5 obj2=new Nokia5();
		obj2.mobileData();
		obj2.nokia5Data();
		System.out.println("**********************");
		
		System.out.println("Mobile3 deatails");
		System.out.println("---------------------");
		Nokia5plus obj3=new Nokia5plus();
		obj3.mobileData();
		obj3.nokia5Data();
		obj3.nokia5plusData();

	}

}
