package basic_programs;

import java.util.Scanner;

public class SwitchCase_String_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name:");
		String name=sc.nextLine();
		String country=name.toUpperCase();//convert str in uppercase
		switch(country)
		{
		case"INDIA":
			System.out.println("country code is +91");
			break;
		case"USA":
			System.out.println("country code is +1");
			break;
		case"SPAIN":
			System.out.println("country code is +34");
			break;
		case"ITALY":
			System.out.println("country code is +39");
			break;
			default:
				System.out.println("INVALID");
		}

	}

}
