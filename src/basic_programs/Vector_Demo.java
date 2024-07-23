package basic_programs;

import java.util.*;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vect=new Vector(5);
		 System.out.println("initial capacity of vector"+vect.capacity());
         vect.addElement(new Integer(88));
         vect.addElement(new Integer(2));
         vect.addElement(new Integer(3));
         vect.addElement(new Float(2.1549));
         vect.addElement(new Float(3.14159));
         vect.addElement(new String("Hello"));
         vect.addElement(new String("world")); 
         vect.addElement(new Double(45.4587));
         vect.addElement(new String("hi"));
         
         System.out.println("Capacity(After adding elements)"+vect.capacity());
         System.out.println("size of vector:"+vect.size());
         System.out.println("First item:"+vect.firstElement());
         System.out.println("last item:"+vect.lastElement());

	}

}
