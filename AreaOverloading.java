package raj;
class Area
{
	int a,b,area;
	void area(int a)
	{
		area=a*a;
		System.out.println("Area of Square is : "+area);
	}
	void area(int a,int b)
	{
		area=a*b;
		System.out.println("Area Of Rectangle is: "+area);
		
	}
}
public class AreaOverloading {

	public static void main(String[] args) {
		Area obj=new Area();
		obj.area(2);
		obj.area(2,89);
	}

}
