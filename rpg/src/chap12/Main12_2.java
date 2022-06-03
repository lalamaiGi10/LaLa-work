package chap12;

import ex12.A;
import ex12.B;
import ex12.X;
import ex12.Y;

public class Main12_2 {

	public static void main(String[] args) {
		X obj = new A();
		obj.a();
//		obj.b();
//		obj.c();

		Y y1= new A();
		Y y2= new B();
		y1.a();
		y2.a();
	
	}

}
