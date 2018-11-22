package raj;
class Phone
{
	String s="Mobile details";
	void phoneData()
	{
		System.out.println(""+s);
	}
}
class Platform1 extends Phone
{
	String pform1="IOS";
	void platform1Data()
	{
		System.out.println("Operating System is: "+pform1);
	}
	
}
class Platform2 extends Phone
{
	String pform2="ANDROID";
	void platform2Data()
	{
		System.out.println("Operating System is: "+pform2);
	}
}
class Platform3 extends Phone
{
	String pform3="WINDOWS";
	void platform3Data()
	{
		System.out.println("Operating System is: "+pform3);
	
	}
}
class Brand extends Platform2
{
	String company="Redmi";
	void companyData()
	{
		System.out.println("Company name is:"+company);
	}
}
class RN5Pro extends Brand
{
	String mobile1="Redmi Note5 Pro";
	void rn5proData()
	{
		System.out.println(mobile1);
	}
}
class RN6Pro extends Brand
{
	String mobile2="Redmi Note6 Pro";
	void rn6proData()
	{
		System.out.println(mobile2);
	}
}
public class Hybridlevel {

	public static void main(String[] args) {
		System.out.println("Different Mobiles and their OS");
		System.out.println("OS 1:");
		System.out.println("----------------------");
		Platform1 obj1=new Platform1();
		obj1.phoneData();
		obj1.platform1Data();
		
		System.out.println("OS 2:");
		System.out.println("----------------------");
		Platform2 obj2=new Platform2();
		obj2.phoneData();
		obj2.platform2Data();
		
		System.out.println("OS 3:");
		System.out.println("----------------------");
		Platform3 obj3=new Platform3();
		obj3.phoneData();
		obj3.platform3Data();
		
		System.out.println("Mobiles of Android:");
		System.out.println("----------------------");
		Brand obj4=new Brand();
		obj4.phoneData();
		obj4.platform2Data();
		obj4.companyData();
		
		System.out.println("Mobile 1 details:");
		System.out.println("----------------------");
		RN5Pro obj5=new RN5Pro();
		obj5.phoneData();
		obj5.platform2Data();
		obj5.companyData();
		obj5.rn5proData();
		
		System.out.println("Mobile 2 details:");
		System.out.println("----------------------");
		RN6Pro obj6=new RN6Pro();
		obj6.phoneData();
		obj6.platform2Data();
		obj6.companyData();
		obj6.rn6proData();
	}

}
