class Big
{
int a[]={10,40,20,60};
	int max=0;
int b;

void bigNumber()
	{
	
	for(int i=0;i<4;i++)
		{
		if(a[i]>max)
			{
			max=a[i];
			b=max;
			}
		
		System.out.println(b);
		}

	}

}
class TestBig
{
public static void main(String args[])
{
Big obj=new Big();
obj.bigNumber();

}
}
