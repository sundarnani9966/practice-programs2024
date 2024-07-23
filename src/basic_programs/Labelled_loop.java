package basic_programs;

public class Labelled_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer_loop: for(int i=1;i<=3;i++)
		{
			inner_loop: for(int j=1;j<=3;j++)
			{
				//int i;
				//int j;
				if(i==2 && j==2)
				{
					System.out.println("continue executes for outer loop at i=2 & j=2");
					continue outer_loop;
				}
				System.out.println("value of i:"+i+"value ofj:"+j);
			}
		}

	}

}
