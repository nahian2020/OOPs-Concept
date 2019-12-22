package abstractconcepts3;

public class Result {

	public static void main(String[] args) {
		Math1 m1= new Math1();
		Math2 m2= new Math2();
		Math3 m3= new Math3();
		
		m1.calculate(5);
		m2.calculate(5);
		m3.calculate(5);

		Calculation c1 = new Math2();
		c1.getResult();
		
	}

}
