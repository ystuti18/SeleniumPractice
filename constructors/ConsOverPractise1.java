package constructors;

public class ConsOverPractise1 {
	int age;
	double salary;
	ConsOverPractise1() {
		System.out.println("Zero- Parameterized Constructor started");
		System.out.println(" having no parameters");
		System.out.println("Zero- Parameterized Constructor Ends....");	
	}
	ConsOverPractise1(int a, double b){
		System.out.println("Parameterised Constructor Started");
		System.out.println("having integer and double parameters");
		age=a;
		salary=b;
		System.out.println("Parameterised Constructor Ends");
	}
	ConsOverPractise1(int a) {
		System.out.println("int Parameterized Constructor started");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("int Parameterized Constructor Ends....");
	}
	ConsOverPractise1(double b) {
		System.out.println("double Parameterized Constructor");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("double- Parameterized Constructor Ends....");
	}
	public static void main(String[] args) {
		
		ConsOverPractise1 a1=new ConsOverPractise1(35,65000.56);
		System.out.println("Zero- Parameterized Constructor is called");

	}

}
