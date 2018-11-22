class Employdata
{
int empno;
String name;
String town;
int basic;
float hra;
float da;

Employdata(int a,String b,String c,int d,float e,float f)
{
empno=a;
name=b;
town=c;
basic=d;
hra=e;
da=f;

}
void EmployNo1()
{
System.out.println("Empno:"+empno);
System.out.println("Name:"+name);
System.out.println("Town:"+town);
System.out.println("Basic:"+basic);
System.out.println("Hra:"+hra);
System.out.println("Da:"+da);
System.out.println("salary:"+(basic+hra+da));
System.out.println("-----------------------------------------------------------");
}
void EmployNo2()
{
System.out.println("Empno:"+empno);
System.out.println("Name:"+name);
System.out.println("Town:"+town);
System.out.println("Basic:"+basic);
System.out.println("Hra:"+hra);
System.out.println("Da:"+da);
System.out.println("salary:"+(basic+hra+da));
System.out.println("-----------------------------------------------------------");
}
void EmployNo3()
{
System.out.println("Empno:"+empno);
System.out.println("Name:"+name);
System.out.println("Town:"+town);
System.out.println("Basic:"+basic);
System.out.println("Hra:"+hra);
System.out.println("Da:"+da);
System.out.println("salary:"+(basic+hra+da));
System.out.println("-----------------------------------------------------------");
}
}
class TestEmploydata
{
public static void main(String args[])
{
Employdata obj1=new Employdata(236,"Rajashekar","Warangal",20000,3000,2000);
obj1.EmployNo1();

Employdata obj2=new Employdata(237,"Harish","Hyderabad",30000,4500,3000);
obj2.EmployNo2();

Employdata obj3=new Employdata(238,"Kalyan","Nalgonda",40000,6000,4000);
obj3.EmployNo3();
}
}
