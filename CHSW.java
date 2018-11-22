package raj;
public class CHSW {

	public static void main(String[] args) {
		String s="Java is object oriented programming language developed by James gosling";
		String s1[]=s.split(" ");
		String s2[]=s.split("");
		int chcount=0;
		int wcount=0;
		for(int i=0;i<s1.length;i++)
		{
			wcount++;
		}
		for(int j=0;j<s2.length;j++)
		{
			chcount++;
		}
		System.out.println("No of words are :"+wcount);
		System.out.println("No of characters are :"+chcount);
		System.out.println("No of Spaces are: "+(wcount-1));
	}

}
