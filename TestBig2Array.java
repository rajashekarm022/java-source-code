package raj;

public class TestBig2Array
{

	public static void main(String[] args) 
	{
	int a[]={20,100,27,55,68};
	int b=a[0];
	int max=0;
	int k=0;
	for(int i=1;i<a.length;i++)
	{
			if(a[i]>b)
			{
				b=a[i];
				k=i;
			}
	}
			System.out.println(b+" is first bigger value");
	
	for(int i=1;i<a.length;i++)
		{
				if(i!=k)
				{
					if(a[i]>max)
					{
						max=a[i];
					}
						
				}
				
	
		}
			System.out.println(max+" is second bigger value");
	}
}
