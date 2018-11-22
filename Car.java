package raj;
class Mechanical
{
	String part1;
	String part2;
	String part3;
	String part4;
	String part5;
	String part6;
	String part7;
	String part8;
	public Mechanical(String part1, String part2, String part3, String part4, String part5, String part6, String part7,
			String part8) {
		super();
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
		this.part5 = part5;
		this.part6 = part6;
		this.part7 = part7;
		this.part8 = part8;
	}
	
}
class Electrical
{
	String ecomponent1;
	String ecomponent2;
	String ecomponent3;
	String ecomponent4;
	String ecomponent5;
	public Electrical(String ecomponent1, String ecomponent2, String ecomponent3, String ecomponent4,
			String ecomponent5) {
		super();
		this.ecomponent1 = ecomponent1;
		this.ecomponent2 = ecomponent2;
		this.ecomponent3 = ecomponent3;
		this.ecomponent4 = ecomponent4;
		this.ecomponent5 = ecomponent5;
	}
	
}
class CarData
{
	String name;
	int speed;
	String s1;
	String s2;
	Mechanical mcomp;
	Electrical ecomp;
	
	public CarData(String name,int speed,String s1, String s2, Mechanical mcomp, Electrical ecomp) {
		super();
		this.name=name;
		this.speed=speed;
		this.s1 = s1;
		this.s2 = s2;
		this.mcomp = mcomp;
		this.ecomp = ecomp;
	}

	void carengineData()
	{
		System.out.println("Name of car: "+name);
		System.out.println("Speed of car: "+speed+"mph");
		System.out.println("Car has anyone of below two engines");
		System.out.println("1)"+s1);
		System.out.println("2)"+s2);
		System.out.println("Mechanical components are");
		System.out.println("------------------------------");
		System.out.println(mcomp.part1+" "+mcomp.part2+" "+mcomp.part3+" "+mcomp.part4+" "+mcomp.part5+" "+mcomp.part6+" "+mcomp.part7+" "+mcomp.part8);
		System.out.println("Electrical components are");
		System.out.println("--------------------------------");
		System.out.println(ecomp.ecomponent1+" "+ecomp.ecomponent2+" "+ecomp.ecomponent3+" "+ecomp.ecomponent4+" "+ecomp.ecomponent5);
	}
}
public class Car {

	public static void main(String[] args) {
		Mechanical obj1=new Mechanical("CYLINDER,","PISTON,","CRANKSHAFT,","CONNECTING ROD,","CYLINDER HEAD,","VALVES,","OIL PUMP AND SUMP,","FUEL PUMP");
		Electrical obj2=new Electrical("ALTERNATOR,","STARTER MOTOR,","SPARK PLUG,","IGNITION COIL,","ELECTRONIC FUEL INJECTOR");
		CarData obj3=new CarData("Ferrari Monza SP2",186,"I.C Engine ","E.C Engine ",obj1,obj2);
		obj3.carengineData();

	}

}
