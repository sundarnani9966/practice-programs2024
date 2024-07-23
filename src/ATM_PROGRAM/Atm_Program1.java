package ATM_PROGRAM;

import java.util.Scanner;

public class Atm_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bal=500;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("select any one option");
			System.out.println("=======================");
			
			System.out.println("1, Balance");
			System.out.println("2, Deposit");
			System.out.println("3, withdraw");
			System.out.println("4, exit");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("your balance="+ bal);
			     break;
			case 2:
				System.out.println("enter the amount to be deposited =");
			        int damt=sc.nextInt();
		               	bal=bal+damt;
		        	System.out.println("deposited the "+damt+"amount Sucessfully");
		            	break;
			case 3:
				System.out.println("enter amount to be withdraw");
				int wamt=sc.nextInt();
				if(bal>=wamt)
				{
					System.out.println("pls collect the cash="+wamt);
					bal=bal-wamt;
			    break;
				}
				else
				{
					System.out.println("insufficient fund");
					break;
				}
			case 4:
				System.exit(0);
			
			}
			

		}
		}

}
