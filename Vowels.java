package raj;

public class Vowels {

	public static void main(String[] args) {
			String d="I am not a good man";
			char ch[]=d.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			
			{
					int z=d.indexOf(ch[i]);
					System.out.println("The position of "+ch[i]+" is "+z);
			}
			}
	}

}
