package raj;
class Marks
{
	int total=30;
	void marksData()
	{
		System.out.println("total marks:"+total);
	}
}
class Telugu extends Marks
{
	int telugumarks=10;
	void teluguData()
	{
		System.out.println("Telugu:"+telugumarks);
	}
}
class Hindi extends Telugu
{
	int hindimarks=9;
	void hindiData()
	{
		System.out.println("Hindi:"+hindimarks);
	}
}
class English extends Hindi
{
	int englishmarks=9;
	void englishData()
	{
		System.out.println("English:"+englishmarks);
	}
}
	
public class Multilevel {

	public static void main(String[] args) {
		System.out.println("Total and Telugu marks");
		System.out.println("======================");
		Telugu obj1=new Telugu();
		obj1.marksData();
		obj1.teluguData();
	
		System.out.println("Total,Telugu and Hindi marks");
		System.out.println("======================");
		Hindi obj2=new Hindi();
		obj2.marksData();
		obj2.teluguData();
		obj2.hindiData();
		
		System.out.println("Total,Telugu,Hindi and English marks");
		System.out.println("======================");
		English obj3=new English();
		obj3.marksData();
		obj3.teluguData();
		obj3.hindiData();
		obj3.englishData();


	}

}
