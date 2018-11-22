package raj;

public class Pali 
{

	public static void main(String[] args) 
	{
		String s="rajasher";
		char ch[]=s.toCharArray();
		int x=ch.length;
		for (int i = 0; i < x-1; i++,x--) 
		{
			if(ch[i]==ch[x-1])
			{
				if(i==x/2)
				{
					break;
				}
			}
					
			System.out.println("pal");
			
		}
	
	}

}
