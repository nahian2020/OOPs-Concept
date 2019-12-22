package abstractconcepts3;

public class Math2 extends Calculation  {
public Math2() {
	System.out.println("Sub class math1 Constructor.....");

}
	@Override
	public void calculate(double x) {
		System.out.println("Squre root = " + Math.sqrt(x));		
	
	}

	@Override
	public void process(String name) {
		System.out.println("Squre method");	
	}

}
