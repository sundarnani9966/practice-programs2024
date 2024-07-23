package basic_programs;

import java.io.DataInputStream;

public class Array2_Dimentions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream input=new DataInputStream(System.in);
		System.out.println("enter the array values");
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				try {
					arr[i][j]=Integer.parseInt(input.readLine());
				}
				catch(Exception e) {
			}
		}

	}
		System.out.println("Array is:\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("value at arr["+i+"]["+j+"] is:"+arr[i][j]);
			}
		}
	}

}
