package kkfundaprograming;
//swapping two numbers with temp and with out useing temp
public class swappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=7,b=15;
       System.out.println("before swapping numbers");
       System.out.println("a:"+a+" b:"+b);
       /*approach lowgic1
      int t=a;
      a=b;
      b=t;
      //approachloggic2
       a=a+b;
       b=a-b;
       a=a-b;
       //approachloggic3
       a=a*b;
       b=a/b;
       a=a/b;
       
     //approachloggic4
       a=(a+b)-(b=a);
       */
     //approachloggic5
       /*
       a=a^b;
       b=a^b;
       a=a^b;
       */
      System.out.println("after swapping numbers");
       System.out.println("a:" +a+" b:" +b);
	}

}
