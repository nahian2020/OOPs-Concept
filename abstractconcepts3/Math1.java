package abstractconcepts3;

public class Math1 extends Calculation {

	@Override
	public void calculate(double x) {
System.out.println("Squre = " + (x*x));		
	}

	@Override
	public void process(String name) {
		System.out.println("Squre method");		
		
	}
	
	public void finishCalculation() {
		System.out.println("finish math");
	}

}
