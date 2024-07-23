package basic_programs;

public class Access_specifierDemo {
	int a=10;
	int b=20;
	 private int c=30;
	 public void method1()
	 {
		 System.out.println("public method");
	 }
	 private void method2() {
		 System.out.println("private method");
	 }
	 public static void main(String[] args) {
		 Access_specifierDemo main=new Access_specifierDemo();
	/* main.a;
		 main.b;
		 main.c;
		 main.method1();
		 main.method2();
		 System.out.println(main);*/
	}

}
