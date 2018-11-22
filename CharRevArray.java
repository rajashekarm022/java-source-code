package raj;

public class CharRevArray
{

	public static void main(String[] args) 
	{
		char ch[]={'a','f','y','g'};
		char b[]=new char[ch.length];
		int j=0;
		
		for (int i=ch.length-1;i>=0;i--)
		{
			b[j]=ch[i];
			j++;
		}
		for(j=0;j<b.length;j++)
			{
			System.out.println(b[j]);
			}
	
	}

}
