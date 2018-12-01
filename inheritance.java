package raj;
class Ab
{
	int i;
}
class Bb extends Ab
{
	int j;
	void display()
	{
		System.out.println(j+""+i);
	}
}
class inheritance {

	public static void main(String[] args) {
		
Bb obj=new Bb();
obj.display();
	}

}
