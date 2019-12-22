package abstractconcepts3;

public class Math3  extends Calculation {

	@Override
	public void calculate(double x) {
		System.out.println("cube = " + (x*x*x));
	}

	@Override
	public void process(String name) {
		System.out.println("Cube method");	
		
	}

}
