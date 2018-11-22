package raj;
class A
{
	int wheels=2;
	int brakes=2;
	int clutches=1;
	int tanks=1;
	void bikedata()
	{
		System.out.println("No of wheels   :"+wheels);
		System.out.println("No of brakes   :"+brakes);
		System.out.println("No of clutches :"+clutches);
		System.out.println("No of tanks    :"+tanks);
	}
}
	class B extends A
	{
		int gears=0;
		String color="red";
		int cc=125;
		void access125()
		{
			System.out.println("No of gears    :"+gears);
			System.out.println("color          :"+color);
			System.out.println("CC             :"+cc);
			
		}
	}

public class Singlelevel {

	public static void main(String[] args) {
		System.out.println("Access 125cc properties are :");
		System.out.println("-----------------------------");
		B obj=new B();
		obj.bikedata();
		obj.access125();
	}

}
