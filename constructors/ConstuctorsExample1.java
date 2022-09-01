package constructors;

class ConstuctorsExample1 {

	int i = 10;

	ConstuctorsExample1() {
		System.out.println("Running Class ConstuctorsExample1");
	}


	
	public static void main(String[] args) {
		
		System.out.println("Program Starts....");
		
		ConstuctorsExample1 a1 = new ConstuctorsExample1();
		
		System.out.println("i=" + a1.i);
		
		System.out.println("Program Ends");

	}
}
