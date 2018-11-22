class Primeno
{
int n;
int temp=0;
int count=0;
Primeno(int n)
{
this.n=n;
}
void setData()
	{
	for(n=1;n<10;n++)
		{
		for(int i=1;i<=n;i++)
			{
			if(n%i==0)
				{
				count++;
				}
			}
                if(count==2)
			{
			temp++;
			System.out.println(n +"is a prime number");
			}
		}
	
		/*System.out.println("Total Prime no count is:" +temp);*/
	}
}
class TestPrimeno
{
public static void main(String args[])
{
Primeno obj=new Primeno(1);
obj.setData();
}
}

