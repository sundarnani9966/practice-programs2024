package kkfundaprograming;

import java.util.Scanner;

public class EvenNumbersOnRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting and ending values");
		int s1=sc.nextInt();
		int e1=sc.nextInt();
		for(int i=s1;i<=e1;i++)
		{
			if(i%2==0)
			{
				System.out.println("this is even number" +i+" ");
			}
			//System.out.println("this is odd number" +i+" ");
		}

	}

}
