package basic_programs;

import java.util.Scanner;

public class WhileLOOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i!=1)
		{
			System.out.println("you are inside while loop");
			System.out.println("press 1 to Exit from loop");
			i=sc.nextInt();
		}
		System.out.println("you are out of while loop");

	}

}
