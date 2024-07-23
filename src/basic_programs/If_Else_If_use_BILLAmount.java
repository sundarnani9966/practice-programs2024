package basic_programs;

import java.util.Scanner;



public class If_Else_If_use_BILLAmount {

	public static void main(String[] user_input) {
		
				
		
		int amount=Integer.parseInt(user_input[0]);//command line agrs
		if(amount>=1000)
		{
			amount=amount-200;
		}
		else if(amount>=500)
		{
			amount=amount-100;
		}
		else if(amount>=100)
		{
			amount=amount-50;
		}
		else
		{
			System.out.println("no discount");
		}
		System.out.println("Bill to pay after discount:"+amount);
		

	}

}
