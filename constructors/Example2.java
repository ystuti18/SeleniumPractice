package constructors;

public class Example2 {

	double d = 34.5;

	Example2() {
		System.out.println("Running Example2 constructor");
		d = 12.45;
	}



	public static void main(String[] args) {
		System.out.println("Program Starts....");
		Example2 a1 = new Example2();
		System.out.println("d=" + a1.d);
		System.out.println("--------------------");
		Example2 b2 = new Example2();
		System.out.println("d=" + b2.d);
		System.out.println("Programs Ends....");
	}
}
