package abstractconcepts3;

public abstract class Calculation {
	public Calculation() {
		System.out.println("Abstract class Constructor.....");
	}
	
public abstract void calculate (double x);
public abstract void process (String name);

public void getResult() {
	System.out.println("Find the correct value");
}
}
