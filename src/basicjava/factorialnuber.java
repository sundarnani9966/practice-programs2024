package basicjava;

import java.util.Scanner;

public class factorialnuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			System.out.println("print factorial number"+fact);
		}
		System.out.println("method ended");

	}

}
