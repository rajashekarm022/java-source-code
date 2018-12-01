package raj;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Stringobj {

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("-------------------");
		ArrayList<String> obj=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Strings you want to add");
		obj.add(scanner.nextLine());
		obj.add(scanner.nextLine());
		obj.add(scanner.nextLine());
		obj.add(scanner.nextLine());
		obj.add(scanner.nextLine());
		System.out.println("Data of the array is:");
		for(String s:obj)
		{
			System.out.println(s);
		}
		for(int i=0;i<7;i++)
		{
		System.out.println("1)Add");
		System.out.println("2)Delete");
		System.out.println("3)Search");
		System.out.println("4)Sort");
		System.out.println("5)Min");
		System.out.println("6)Max");
		System.out.println("7)Exit");
		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
			switch(choice)
			{
			
			
			case 1:System.out.println("Enter the index of the String to add");
				   int a=scanner.nextInt();
				   scanner.nextLine();
				   System.out.println("Enter the String to add");
				   String s=scanner.nextLine();
				   obj.add(a, s);
				   for(String s1:obj)
					{
						System.out.println("Data of the array after adding: "+s1);
					}
				   System.out.println("-------------------");
				   break;
			case 2:System.out.println("Enter the index of the String to delete");
				   int b=scanner.nextInt();
				   scanner.nextLine();
				   obj.remove(b);
				   for(String s2:obj)
					{
						System.out.println("Data of the array after deleting: "+s2);
					}
				   System.out.println("-------------------");
				   break;
			case 3:System.out.println("Enter the String you want to search");
				   scanner.nextLine();
				   String str1=scanner.nextLine();
				   boolean c=obj.contains(str1);
				   if(c==true)
				   {
					   System.out.println("object is existed");
				   }
				   else
				   {
					   System.out.println("object not existed");
				   }
				   System.out.println("-------------------");
				   break;
			case 4:Collections.sort(obj);
				   for(String s3:obj)
				   {
					   System.out.println("After sorting: "+s3);
				   }
				   System.out.println("-------------------");
				   break;
			case 5:Collections.min(obj);
			       for(String s4:obj)
			       {
			    	   System.out.println("The min object is: "+s4);
			       }
			       System.out.println("-------------------");
				   break;
			case 6:Collections.max(obj);
		       for(String s5:obj)
		       {
		    	   System.out.println("The min object is: "+s5);
		       }
		       System.out.println("-------------------");
				   break;
			case 7:System.exit(0);
				   
			}
		
		}
	}

}
