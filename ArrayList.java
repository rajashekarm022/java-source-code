package raj;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the elememts of an array");
		int i;
		for(i=0;i<6;i++)
		{
			a[i]=scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Inserted elements are:");
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		for(i=5;i>=0;i--)
		{
			a[i+1]=a[i];
			if(i==0)
			{
				a[0]=100;
			}
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
