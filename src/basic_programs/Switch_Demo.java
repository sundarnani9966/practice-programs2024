package basic_programs;

import java.util.Scanner;

public class Switch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int i;
      System.out.println("Enter any no.from 1 to 5");
      i=sc.nextInt();
      
      switch(i)
      {
     
      
      case 1:
      {
    	  System.out.println("you Enter:ONE");
    	  break;
      }
      case 2:
      {
    	  System.out.println("you Enter:two");
    	  break;
      }
      case 3:
      {
    	  System.out.println("you Enter:three");
    	  break;
      }
      case 4:
      {
    	  System.out.println("you Enter:four");
    	  break;
      }
      case 5:
      {
    	  System.out.println("you Enter:five");
    	  break;
      }
      default:
      {
    	  System.out.println("you not entered no.in range 1 to  5");
      }
      }
	}

}
