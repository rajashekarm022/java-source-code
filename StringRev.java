package raj;

public class StringRev {

	public static void main(String[] args) {
		String s="klmnop";
		char ch[]=s.toCharArray();
		{
			int i;
			System.out.println("the character array is ");
			for (i = 0; i < ch.length; i++)
			{
				System.out.println(ch[i]);
			}
			int j=0;
			char a[]=new char[ch.length];
			for(i=ch.length-1;i>=0;i--)
			{
				a[j]=ch[i];
				j++;
			}
			System.out.println("the reverse of character array is ");
			for(j=0;j<a.length;j++)
			{	
				System.out.println(a[j]);
			}
			String s2=new String(a);
			System.out.println("the reverse string is");
			System.out.println(s2);
		}

	}

}
