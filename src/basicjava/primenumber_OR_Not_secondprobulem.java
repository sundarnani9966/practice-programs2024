package basicjava;

import java.util.Scanner;

public class primenumber_OR_Not_secondprobulem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,count = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value:");
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(a+"is a prime number");
		}
		else
		{
			System.out.println(a+"is not a prime number");
		}

	}

}
