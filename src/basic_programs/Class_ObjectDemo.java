package basic_programs;

public class Class_ObjectDemo {

	int class_var1=50;
	float class_var2=3.14f;
	
	void method()
	{
		int method_var1=10;
		float method_var2=3.14f;
		System.out.println("class_var1 💕💕 "+class_var1);
		System.out.println("class_var2😍 😊"+class_var2);
		System.out.println("method_var1 🎂🎂"+ method_var1);
		System.out.println("method_var2✨✨ "+ method_var2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_ObjectDemo demo=new Class_ObjectDemo();
		demo.method();
	}

}
