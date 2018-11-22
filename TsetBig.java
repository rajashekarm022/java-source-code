class Big
{
static void bigNumber()
	{
	int a[]={10,40,20,60};
	int b;
	for(int i=0;i<4;i++)
		{
		if(a[i]>a[i+1])
			{
			b=a[i];
			a[i+1]=b;
			}
		else
			{
			b=a[i+1];
			a[i]=b;
			}
		System.out.println(a[i]);
		}
	}
}
class TestBig
{
public static void main(Stirng args[])
{
Big.bigNumber();
}
}
