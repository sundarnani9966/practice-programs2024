/**
 * 
 */
package basicjava;

/**
 * this one method of prime numbers
 * 
 */
public class Prime_number_or_not {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method  
		int a=8;
		boolean b=true;
		for(int i=2;i<a;i++)
		{
		if(a%i==0)
		{
			 b=false;
			 break;
			
		}
           
       }
		System.out.println(b);
	}
}


