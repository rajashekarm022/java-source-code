package raj;
class Bike
{
	int wheels=2;
	int brakes=2;
	int clutches=1;
	int tanks=1;
	void bikeData()
	{
		System.out.println("No of wheels   :"+wheels);
		System.out.println("No of brakes   :"+brakes);
		System.out.println("No of clutches :"+clutches);
		System.out.println("No of tanks    :"+tanks);
	}
}
class Access125 extends Bike
{
	int gears=0;
	String color="red";
	int cc=125;
	void access125Data()
	{
		System.out.println("No of gears    :"+gears);
		System.out.println("color          :"+color);
		System.out.println("CC             :"+cc);
		
	}
}
class Activa extends Bike
{
	int gears=0;
	String color="white";
	int cc=100;
	void activaData()
	{
		System.out.println("No of gears    :"+gears);
		System.out.println("color          :"+color);
		System.out.println("CC             :"+cc);
	}
}
class Shine extends Bike
{
	int gears=4;
	String color="black";
	int cc=150;
	void shineData()
	{
		System.out.println("No of gears    :"+gears);
		System.out.println("color          :"+color);
		System.out.println("CC             :"+cc);
	}
}
public class Heirarchylevel {

	public static void main(String[] args) {
		System.out.println("Access 125cc properties are :");
		System.out.println("-----------------------------");
		Access125 obj1=new Access125();
		obj1.bikeData();
		obj1.access125Data();
		
		System.out.println("Activa  properties are :");
		System.out.println("-----------------------------");
		Activa obj2=new Activa();
		obj1.bikeData();
		obj2.activaData();
		
		System.out.println("Shine  properties are :");
		System.out.println("-----------------------------");
		Shine obj3=new Shine();
		obj1.bikeData();
		obj3.shineData();
		

	}

}
