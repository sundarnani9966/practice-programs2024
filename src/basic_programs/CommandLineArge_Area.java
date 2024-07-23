package basic_programs;

public class CommandLineArge_Area {

	public static void main(String []user_input) {
		// TODO Auto-generated method stub
	//int[] user_input= {10,23};
		
		int length=Integer.parseInt(user_input[10]);
		int height=Integer.parseInt(user_input[20]);
		int area=(length*height)/2;
		System.out.println("area of triangle is"+area);
		

	}

}
