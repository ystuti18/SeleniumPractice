package constructors;

public class ConsOverloading01 {
	
	ConsOverloading01(){
    System.out.println("Zero Parameterized Constructor");
	System.out.println("Having no parameter");
	
}
	ConsOverloading01(int a){
		System.out.println("Parameterised Constructor");
		System.out.println("Having integer type parameter");
	}
	ConsOverloading01(double b){
		System.out.println("Parameterised Constructor");
		System.out.println("Having double type parameter");
	}
	ConsOverloading01(int a ,double b, int c ){
		System.out.println("Having Parameterised Constructor");
		System.out.println("Having integer type, double type,integer type");
	}
	ConsOverloading01(int a, int b, double c){
		System.out.println("Having Parameterised Constructor");
		System.out.println("Having interger type, integer type, double type");
	}
	ConsOverloading01(double a, int b, int c){
		System.out.println("Having Parameterised Constructor");
		System.out.println("Having double type,integer type, integer type");
	}
	
	public static void main(String[] args) {
		ConsOverloading01 a1= new ConsOverloading01();
		ConsOverloading01 b1= new ConsOverloading01(56);
		ConsOverloading01 c1= new ConsOverloading01(56.8);
		ConsOverloading01 d1= new ConsOverloading01(56,56.8,45);
		ConsOverloading01 e1= new ConsOverloading01(56,45,56.8);
		ConsOverloading01 f1= new ConsOverloading01(56.8,56,45);
	}

}
