package kkfundaprograming;

import java.util.Scanner;

public class DisplayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("print nubers "+i);
		}
		/*for(int i=n;i>=1;i--)
		{
			System.out.println("print nubers "+i);
		}
		*/

	}

}
