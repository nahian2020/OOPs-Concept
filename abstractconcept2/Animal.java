package abstractconcept2;

public abstract class Animal {
	public Animal() {
		System.out.println(" Animal class constructor");
	}
	public abstract void createSound();
	public abstract void doHunt();
	public abstract void eatFood();
	public void sleep() {
		System.out.println("Animal sleeping patterns are not same");
	}


}
