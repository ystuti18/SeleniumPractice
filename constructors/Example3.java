package constructors;

public class Example3 {

	double d = 34.5;

	Example3() {
		System.out.println("Running Example3 constructor");
		System.out.println(this.d);
		d = 12.45;
		
	}

}
class Run2
{
	double d = 54.9;

	Run2() {
		System.out.println("Running Run2 constructor");
		d = 56.12;
	}
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		Example3 a1 = new Example3();
		Run2 b1= new Run2();
		System.out.println("d=" + a1.d);
		System.out.println("d=" + b1.d);
		System.out.println("--------------------");
		Example3 b2 = new Example3();
		Run2 a2=new Run2();
		System.out.println("d=" + b2.d);
		System.out.println("d=" + a2.d);
		System.out.println("Programs Ends....");
	}
	
}

