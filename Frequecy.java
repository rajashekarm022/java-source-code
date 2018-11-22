package raj;

public class Frequecy {

	public static void main(String[] args) {
		String s="aaabbaacccbbaab";
		char ch[]=s.toCharArray();
		int acount=0,bcount=0,ccount=0;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]=='a')
			{
				acount++;
			}
			else if(ch[i]=='b')
			{
				bcount++;	
			}
			else if(ch[i]=='c')
			{
				ccount++;	
			}
		}
		System.out.println("char    frequency");
		System.out.println("-----------------");
		System.out.println("a         "+acount);
		System.out.println("b         "+bcount);
		System.out.println("c         "+ccount);
	}
	
}
