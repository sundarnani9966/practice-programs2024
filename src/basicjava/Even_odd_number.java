package basicjava;

import java.util.Scanner;

public class Even_odd_number {
	
	public static void main(String[]args)
	{
		int a;
	
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("a value is even number"+a);
		}
		else
		{
			System.out.println("a value is odd number"+a);
		}
		
		System.out.println("main method ended");
		
	}

}
