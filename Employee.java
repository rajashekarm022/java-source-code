package raj;
class TempAddress
{
	int doorno;
	String street;
	String area;
	long pin;
	public TempAddress(int doorno, String street, String area, long pin) {
		
		this.doorno = doorno;
		this.street = street;
		this.area = area;
		this.pin = pin;
	}
	
}
class PermanentAddress
{
	int doorno;
	String vill;
	String city;
	long pin;
	public PermanentAddress(int doorno, String vill, String city, long pin) {
		
		this.doorno = doorno;
		this.vill = vill;
		this.city = city;
		this.pin = pin;
	}
	
}
class Employeedetails
{
	int empid;
	String empname;
	String compname;
	double salary;
	TempAddress taddr;
	PermanentAddress paddr;
	public Employeedetails(int empid, String empname, String compname, double salary, PermanentAddress paddr,  TempAddress taddr) {
		
		this.empid = empid;
		this.empname=empname;
		this.compname = compname;
		this.salary = salary;
		this.taddr=taddr;
		this.paddr=paddr;
	}
	void printData()
	{
		System.out.println("Employee id is:"+empid);
		System.out.println("Employee name is:"+empname);
		System.out.println("Company name is :"+compname);
		System.out.println("Salary is: "+salary);
		System.out.println("Permanent address is : "+paddr.doorno+" "+paddr.vill+" "+paddr.city+" "+paddr.pin);
		System.out.println("Temperary address is :"+taddr.doorno+" "+taddr.street+" "+taddr.area+" "+taddr.pin);
	}
}
public class Employee {

	public static void main(String[] args) {
		PermanentAddress obj=new PermanentAddress(12,"nekkonda","warangal",506122);
		TempAddress obj2=new TempAddress(22,"ameerpet","hyd",500012);
		Employeedetails obj3=new Employeedetails(236,"raju","scls",25000,obj,obj2);
		obj3.printData();
	}
	
}
