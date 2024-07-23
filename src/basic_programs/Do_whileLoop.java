package basic_programs;

import java.util.Scanner;

public class Do_whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("you are inside do-while loop");
			System.out.println("press 1 to Exit from loop");
			i=sc.nextInt();
		}
		while(i!=1);
		System.out.println("you are out of do-while loop");

	}

}
