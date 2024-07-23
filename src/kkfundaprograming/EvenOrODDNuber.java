package kkfundaprograming;

import java.util.Scanner;

public class EvenOrODDNuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter n value");
           int n=sc.nextInt();
         //  int O=sc.nextInt();
          // for(int i=E;i<O;i++)
           if(n>=1)
           {
           
        	   if(n%2==0)
        	   
        	   {
        		   System.out.println(n+"is even");
        	   }
        	   else
        	   {
        		   System.out.println(n+"is odd");
        	   }
//        	   System.out.println(i);
}
           else
           {
        	   System.out.println("plese enter correct value");
           }
	
}
}
