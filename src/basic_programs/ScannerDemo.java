package basic_programs;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your sem");
		int sem=sc.nextInt();
		System.out.println("Enter your current CGPA");
		float CGPA=sc.nextFloat();
		System.out.println("\n Details");
		System.out.println("Name:"+name);
		System.out.println("sem:"+sem);
		System.out.println("CGPA:"+CGPA);
		
		
		

	}

}
